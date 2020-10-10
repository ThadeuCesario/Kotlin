# Kotlin

<h2>Aula 1</h2>
<ul>
<li> 
Temos senteças de códigos que podem ou não terminar com ponto e vírgula.
</li>
<li> 
Sentenças ficam dentro de blocos, que podem ser blocos aninhados.
</li>
<li> 
<code>.kt</code> é a extensão padrão de um arquivo Kotlin.
</li>
</ul>

<h2>Aula 2</h2>
<ul>
<li> 
Temos comentários para KDoc.
</li>
<li> 
Temos comentários simples de uma única linha.
</li>
<li> 
Temos comentários em bloco.
</li>
</ul>

<h2>Aula 3</h2>
<p>
O <code>Kotlin</code> é uma linguagem fortemente tipada. <br/>
Isso significa que, quando eu crio uma variável do tipo <code>int</code>, não posso
atribuir depois para essa variável o tipo <code>string</code>.
</p>
<strong>Ficou mal acostumado pelo Javascript, né? haha</strong>
<p>
Como o Kotlin é uma linguagem fortemente tipada, precisamos ou inicializar ou 
inferir a variável.
</p>
<strong>Muito cuidado quando aplicar inferências, sempre prefira utilizar as variáveis
com seu tipo declarado.
</strong>

<h2>Aula 4</h2>
<p>
<strong>Constantes</strong> são definidas utilizando a palavra reservada <code>val</code>.
</p>

<h2>Aula 5</h2>
<p>
Uma das vantagens do <code>Kotlin</code>, é que podemos utilizar o <code>Java</code>
normalmente.
Portanto, podemos migrar código <code>Java</code> para <code>Kotlin</code>, de forma
totalmente gradual.
</p>

<h2>Aula 6</h2>
<strong>Tipos numéricos</strong>
<table>
<tr>
<td>byte</td>
<td>1 byte</td>
</tr>
<tr>
<td>short</td>
<td>2 bytes</td>
</tr>
<tr>
<td>int</td>
<td>4 bytes</td>
</tr>
<tr>
<td>long</td>
<td>8 bytes</td>
</tr>
</table>
<p>Lembrando que os tipos numéricos possuem um range que vão dos negativos aos positivos.</p>

<h2>Aula 7</h2>
<p>
<strong>Tudo em Kotlin é objeto, inclusive os literais e tipos básicos.</strong>
</p>

<h2>Aula 8</h2>
<p>
<strong>Como criar funções.</strong><br/>
<strong>1)<br/></strong>
<code>fun nomeFuncao(param: Tipo): TipoRetorno{}</code>
<br/>
<br/>
<strong>2)<br/></strong>
<code>fun nomeFuncao(): TipoRetorno{}</code>
<br/>
<br/>
<strong>3)<br/></strong>
<code>fun nomeFuncao(param: Tipo){}</code>
</p>

<h2>Aula 9</h2>
<strong>Template String</strong>
<p>
Veja que assim como no <code>Javascript</code>, o <code>Kotlin</code> possui a possibilidade
de realizarmos interpolação de variáveis utilizando o template string.
</p>

<h2>Aula 10</h2>
<strong>Lembrando que tudo em Kotlin é um objeto</strong>
<p>Vamos para algumas considerações importantes. Como dissemos anteriormente, tudo em Kotlin é um objeto.</p>
<p>E podemos acessar os métodos através do literais, portanto o código abaixo é válido no <code>kotlin</code>.</p>

<pre>
<code>
fun main(args: Array<String>) {
    val a: Int = 33.dec();
    var b: String = a.toString();

    println("Int: ${a}");
    println("Primeiro char da string b é: ${b.first()}");
}
</code>
</pre>

<h2>Aula 11</h2>
<strong>Safe Call Operator</strong>
<p>
Muito semelhante ao java pode utilizar o interrogação para evitarmos acessar o atributo ou método de um objeto que 
esteja <code>null</code>.
</p>
<pre>
<code>
fun main(args: Array<String>) {
    var a: Int? = null; // Safe call operator
    println(a?.dec());
}
</code>
</pre>

<h2>Aula 12</h2>
<strong>Operador Elvis</strong>
<p>
O operador Elvis nos ajuda a definir um valor default, caso o valor que estamos querendo atribuir seja inválido.
<br/><br/>
Veja o o código abaixo que tenho duas constantes.<br/>
Na primeira constante, o <code>opcional</code> é uma <code>string</code> com um <code>safe call operator</code> e é atribuído
para essa constante o <code>null</code>.
<br/><br/>
Logo abaixo temos a constante <code>obrigatorio</code>, que também é uma <code>string</code>, e estamos atribuindo
o valor da constante <code>opcional</code>.
<br/><br/>
<strong style="color:red">Obviamente ocasionará um erro, pois a constante obrigatorio não possui um safe call operator,
permitindo a atribuição de valores nulos.</strong>
</p>
<pre>
<code>
fun main(args: Array<String>) {
    val opcional: String? = null;
    val obrigatorio: String = opcional ?: "Valor Default";
}
</code>
</pre>
<p>Dessa forma utilizamos o <code>operador elvis</code>, que nos permitirá atribuir um valor <code>default</code>
caso não consiga resolver para o primeiro valor, o valor default será atribuído.
</p>
<strong style="color: #0f0">
Uma observação inútil 😂... 
O nome do operador foi criado justamente pela semelhança com o emoji do elvis.<br/>
Bem...pelo menos no Kotlin o Elvis não morreu mesmo.
<br/>
<strong>

<h2>Aula 13</h2>
<strong>Estrutura de controle</strong>
<p>
Um ponto interessente que temos no <code>Kotlin</code> e não tínhamos no <code>Java</code>, é que podemos utilizar
um bloco de <code>if</code> e <code>else</code>, como uma expressão para atribuirmos um valor em uma variável ou constante.
</p>
<p>Veja o exemplo do código abaixo</p>
<pre>
<code>
fun main(args: Array<String>) {
    val num1: Int = 2;
    val num2: Int = 3;

    val maiorValor = if(num1 > num2) {
        println("processando");
        num1;
    } else {
        println("processando");
        num2;
    }

    println("O maior valor é ${maiorValor}!");
}
</code>
</pre>
<strong>Apenas uma observação importante, é que obrigatoriamente a última setença do bloco deve ser o retorno
do valor para aquela expressão. <br/> Por isso temos:<br/><br/>
</strong>
<code>num1;</code> ao final do <code>if</code>, e <code>num2;</code> ao final do <code>else</code>.

<h2>Aula 14</h2>
<strong>Utilizando when</strong>
<pre>
<code>
fun main(args: Array<String>) {
    val nota = 10; //Utilizando inferência

    when(nota){
        10, 9 -> println("Fantástico");
        8, 7 -> println("Parabéns");
        6, 5, 4 -> println("Tem como recuperar");
        in 0..3 -> println("Te vejo no próximo semestre");
        else -> println("Nota inválida");
    }
}
</code>
</pre>
