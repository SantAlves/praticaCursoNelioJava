import java.time.Instant; 

importa a classe Instant, que representa um ponto instantâneo na linha do tempo, sem fuso horário.

import java.time.LocalDate; 

importa a classe LocalDate, que representa uma data sem hora, no formato ISO-8601 (yyyy-MM-dd).

import java.time.LocalDateTime; 

importa a classe LocalDateTime, que representa uma data e hora, sem fuso horário, no formato ISO-8601 (yyyy-MM-ddTHH:mm:ss).

import java.time.format.DateTimeFormatter; 

importa a classe DateTimeFormatter, que é usada para formatar e analisar datas e horas de acordo com um padrão especificado.

DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 

cria um objeto DateTimeFormatter chamado fmt1, que segue o padrão “dd/MM/yyyy”, ou seja, dia/mês/ano.

DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); 

cria um objeto DateTimeFormatter chamado fmt2, que segue o padrão “dd/MM/yyyy HH:mm”, ou seja, dia/mês/ano hora:minuto.

LocalDate d01 = LocalDate.now(); 

cria um objeto LocalDate chamado d01, que representa a data atual do sistema.

LocalDateTime d02 = LocalDateTime.now(); 

cria um objeto LocalDateTime chamado d02, que representa a data e hora atual do sistema.

Instant d03 = Instant.now(); 

cria um objeto Instant chamado d03, que representa o instante atual do sistema.

LocalDate d04 = LocalDate.parse("2022-07-20"); 

cria um objeto LocalDate chamado d04, que representa a data 20 de julho de 2022, usando o método parse que recebe uma string no formato ISO-8601.

LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); 

cria um objeto LocalDateTime chamado d05, que representa a data e hora 20 de julho de 2022, 01:30:26, usando o método parse que recebe uma string no formato ISO-8601.

Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); 

cria um objeto Instant chamado d06, que representa o instante 20 de julho de 2022, 01:30:26 UTC, usando o método parse que recebe uma string no formato ISO-8601.

Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00"); 

cria um objeto Instant chamado d07, que representa o instante 20 de julho de 2022, 01:30:26 com um deslocamento de -03:00 horas em relação ao UTC, usando o método parse que recebe uma string no formato ISO-8601.

LocalDate d08 = LocalDate.parse("20/07/2022", fmt1); 

cria um objeto LocalDate chamado d08, que representa a data 20 de julho de 2022, usando o método parse que recebe uma string no formato “dd/MM/yyyy” e um objeto DateTimeFormatter como argumentos.

LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2); 

cria um objeto LocalDateTime chamado d09, que representa a data e hora 20 de julho de 2022, 01:30, usando o método parse que recebe uma string no formato “dd/MM/yyyy HH:mm” e um objeto DateTimeFormatter como argumentos.

LocalDate d10 = LocalDate.of(2022, 07, 20); 

cria um objeto LocalDate chamado d10, que representa a data 20 de julho de 2022, usando o método of que recebe três inteiros como argumentos, representando o ano, o mês e o dia.

LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 1, 30); 

cria um objeto LocalDateTime chamado d11, que representa a data e hora 20 de julho de 2022, 01:30, usando o método of que recebe cinco inteiros como argumentos, representando o ano, o mês, o dia, a hora e o minuto.

System.out.println("d01 = " + d01.toString()); 

imprime na tela o valor de d01, usando o método toString que retorna uma string no formato ISO-8601.

.
.
.
.
.
etc.