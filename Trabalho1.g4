grammar Trabalho1;

@members {
	public static String grupo="RA=489123";
}

// Análise léxica

// Faz o match em números que podem conter decimal ou não
NUMERO: ('0'..'9')+ ('.'('0'..'9')+)?;

// Faz o match em nomes que devem começar com uma letra e ter qualquer sequencia de digitos (numeros e letras)
NOME: ('a'..'z' | 'A'..'Z')+ ('a'..'z' | 'A'..'Z' | '0'..'9')*;

// Faz o match em uma cadeia de caracteres delimitados por aspas simples ou duplas
CADEIA: '"' (~('\\'|'"'))* '"' | '\'' (~('\\'|'\''))* '\'';

// Faz o match em comentários iniciados por -- e os ignora
COMENTARIO: '-''-' ~('\n'|'\r')* '\n' {skip();};

// Faz o match em espaços e os ignora
ESPACO:(' ' |'\t' | '\r' | '\n') {skip();};

// ***** ANÁLISE SINTÁTICA *****
// Inserido de acordo com o roteiro
programa:
        trecho;

trecho:
        (comando (';')?)* (ultimocomando (';')?)?;

bloco:
        trecho;

comando:
				listavar '=' listaexp |
				chamadadefuncao |
				'do' bloco 'end' |
				'while' exp 'do' bloco 'end' |
				'repeat' bloco 'until' exp |
				'if' exp 'then' bloco ('elseif' exp 'then' bloco)* ('else' bloco)? 'end' |
				'for' NOME {TabelaDeSimbolos.adicionarSimbolo($NOME.text,Tipo.VARIAVEL);} '=' exp ',' exp (',' exp)? 'do' bloco 'end' |
				'for' listadenomes 'in' listaexp 'do' bloco 'end' |
				'function' nomedafuncao corpodafuncao |
				'local' 'function' NOME {TabelaDeSimbolos.adicionarSimbolo($NOME.text,Tipo.FUNCAO);} corpodafuncao |
				'local' listadenomes ('=' listaexp)?;

ultimocomando:
				'return' (listaexp)? | 'break';

nomedafuncao:
				NOME {TabelaDeSimbolos.adicionarSimbolo($NOME.text,Tipo.FUNCAO);} ('.' NOME {TabelaDeSimbolos.adicionarSimbolo($NOME.text,Tipo.FUNCAO);})* (':' NOME {TabelaDeSimbolos.adicionarSimbolo($NOME.text,Tipo.FUNCAO);})?;

listavar:
				var (',' var)*;

var:
				NOME {TabelaDeSimbolos.adicionarSimbolo($NOME.text,Tipo.VARIAVEL);} | expprefixoSemRecursao '(' exp ')?' | expprefixoSemRecursao '.' NOME {TabelaDeSimbolos.adicionarSimbolo($NOME.text,Tipo.VARIAVEL);};

listadenomes:
				NOME {TabelaDeSimbolos.adicionarSimbolo($NOME.text,Tipo.VARIAVEL);} (',' NOME {TabelaDeSimbolos.adicionarSimbolo($NOME.text,Tipo.VARIAVEL);})*;

listaexp:
				(exp ',')* exp;

exp:
				'nil' | 'false' | 'true' | NUMERO | CADEIA | '...' | funcao |
				expprefixo | construtortabela | exp opbin exp | opunaria exp;

expprefixo:
				var | chamadadefuncao | '(' exp ')';

// Remoção da recursividade
expprefixoSemRecursao:
				{String prefixo = "";} NOME {prefixo += $NOME.text;} ( '[' exp ']' | '.' NOME {prefixo += "." + $NOME.text;} )*  { TabelaDeSimbolos.adicionarSimbolo(prefixo,Tipo.FUNCAO); } ;

chamadadefuncao:
				expprefixoSemRecursao args | expprefixoSemRecursao ':' NOME {TabelaDeSimbolos.adicionarSimbolo($NOME.text,Tipo.FUNCAO);} args;

args:
				'(' (listaexp)? ')' | construtortabela | CADEIA;

funcao:
				'function' corpodafuncao;

corpodafuncao:
				'(' (listapar)? ')' bloco 'end';

listapar:
				listadenomes (',' '...')? | '...';

construtortabela:
				'(' (listadecampos)? ')*';

listadecampos:
        campo (separadordecampos campo)* (separadordecampos)?;

campo:
				'(' exp ')?' '=' exp | NOME '=' exp | exp;

separadordecampos:
				',' | ';';

opbin:
				'+' | '-' | '*' | '/' | '^' | '%' | '..' |
				'<' | '<=' | '>' | '>=' | '==' | '~=' |
				'and' | 'or';

opunaria:
				'-' | 'not' | '#';
