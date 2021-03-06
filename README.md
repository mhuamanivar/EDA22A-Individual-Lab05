<div align="center">
<table width="1000px">
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">DEPARTAMENTO ACADÉMICO DE INGENIERÍA DE SISTEMAS E INFORMÁTICA</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Guía de Práctica de Laboratorio</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLD-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>

<div align="center">
    <span style="font-weight:bold;">INFORME DE LABORATORIO</span><br />
</div>
<div align="center">
    <table width="1000px">
        <theader>
            <tr><th colspan="6">INFORMACIÓN BÁSICA</th></tr>
        </theader>
        <tbody>
            <tr><td>ASIGNATURA:</td><td colspan="5">Estructura de Datos y Algoritmos</td></tr>
            <tr><td>TÍTULO DE LA PRÁCTICA:</td><td colspan="5">Árboles</td></tr>
            <tr><td>NÚMERO DE PRÁCTICA:</td><td>05</td><td>AÑO LECTIVO:</td><td>2022 A</td><td>NRO. SEMESTRE:</td><td width="60px">III</td></tr>
            <tr><td>FECHA DE PRESENTACION:</td><td>29-Jun-2022</td><td>HORA DE PRESENTACIÓN:</td><td colspan="3">12:00</td></tr>
            <tr>
            <td colspan="4">NOMBRE:
                <ul>
            	    <li>Melsy Melany Huamaní Vargas 100% - mhuamanivar@unsa.edu.pe</li>
                </ul>
            </td>
            <td>NOTA:</td>
            <td></td>
            </tr>
            <tr><td colspan="6" width="1000px">DOCENTE:
                <ul>
        	    <li>Richart Smith Escobedo Quispe - rescobedoq@unsa.edu.pe</li>
                </ul>
            </td>
            </tr>
        </tbody>
    </table>
</div>

<div align="center">
    <table width="1000px">
        <theader>
            <tr><th>SOLUCIÓN Y RESULTADOS</th></tr>
        </theader>
        <tbody>
	    <tr><td>I. SOLUCIÓN DE EJERCICIOS/PROBLEMAS<br/>
            Realicé los ejercicios correspondientes en el github: <a href="https://github.com/mhuamanivar/EDA22A-Individual-Lab05">https://github.com/mhuamanivar/EDA22A-Individual-Lab05</a><br/>
	    	Explicación o guía de los ejercicios.
        		<ol>
            	    <li>Ejercicio 01: Corchetes equilibrados
                    	<ul>
            	            <li>En primer lugar se creó la clase única principal en donde se evaluará los corchetes con el uso de la clase Stack de Java.</li>
                            <li>Se creó el método main en donde se ingresa un String y se convierte en un arreglo de chars.</li>
                            <li>Se creó el método de cadenaAdecuada para que se evalúe que los carácteres ingresados sean solo los tipos de corchetes "()", "[]", "{}", y no cualquier otro tipo de caracter. Si es que la cadena es adecuada se verifica si está equilibrada en el método verificarEquilibrio.</li>
                            <li>En el método verificarEquilibro se verifica que los corchetes estén equilibrados a través de la clase Stack. Primero ingresa todos aquellos que abren cualquier tipo de corchete. Luego cuando ingresan los que cierran, va eliminando su par correspondiente. Si después de todo el proceso aun queda algún corchete extra retornará false e imprimirá "NO" en main, o si es que algún par no coresponda, entonces la pila no se quedará vacía y retornará false imprimiendo "NO" en main.</li>
                            <li>Ejemplos de ejecución</li>
                            <br/>
                            <center>
                				<img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab05/main/Ej1_imagenes/ej1_ejecucion1.PNG" style="width:40%; height:auto"/>
                                <img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab05/main/Ej1_imagenes/ej1_ejecucion2.PNG" style="width:40%; height:auto"/>
                                <br/><br/>
                                <img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab05/main/Ej1_imagenes/ej1_ejecucion3.PNG" style="width:60%; height:auto"/>
            				</center> <br/>
    	        		</ul>
                    </li> 
                    <br/>
      		    	<li>Ejercicio 02: Operaciones de árbol AVL
                    	<ul>
            	            <li>En este ejercicio se realizará paso a paso la inserción de los números y luego con el árbol construido la eliminación de los números uno por uno.</li>
                            <li>En primer lugar, la inserción de: 100 - 200 - 300 - 400 - 500 - 50 - 25 - 350 - 375 - 360 - 355 - 150 - 175 - 120 - 190.</li> <br/><br/>
                            <center>
                				<img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab05/main/Ej2_imagenes/insercion1.PNG" style="width:85%; height:auto"/>
                                <img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab05/main/Ej2_imagenes/insercion2.PNG" style="width:85%; height:auto"/>
                                <img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab05/main/Ej2_imagenes/insercion3.PNG" style="width:85%; height:auto"/>
                                <img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab05/main/Ej2_imagenes/insercion4.PNG" style="width:85%; height:auto"/>
                                <img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab05/main/Ej2_imagenes/insercion5.PNG" style="width:85%; height:auto"/>
                                <img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab05/main/Ej2_imagenes/insercion6.PNG" style="width:85%; height:auto"/>
                                <img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab05/main/Ej2_imagenes/insercion7.PNG" style="width:85%; height:auto"/>
            				</center> <br/> <br/>
                            <li>Por último, la eliminación paso a paso de: 100 - 200 - 300 - 400 - 500 - 50 - 25 - 350 - 375 - 360 - 355 - 150 - 175 - 120 - 190. Si es que el nodo a eliminar es una hoja, solo se elimina el nodo. Si es que tuviera un hijo, el hijo procede a enlazarse con el padre del nodo a eliminar. Si es que tuviera dos hijos, en este caso se utilzó el método de que el padre del nodo se enlazará con el menor dato del subárbol derecho.</li><br/>
                            <center>
                				<img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab05/main/Ej2_imagenes/eliminacion1.PNG" style="width:85%; height:auto"/>
                                <img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab05/main/Ej2_imagenes/eliminacion2.PNG" style="width:85%; height:auto"/>
                                <img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab05/main/Ej2_imagenes/eliminacion3.PNG" style="width:85%; height:auto"/>
                                <img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab05/main/Ej2_imagenes/eliminacion4.PNG" style="width:85%; height:auto"/>
                                <img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab05/main/Ej2_imagenes/eliminacion5.PNG" style="width:85%; height:auto"/>
                                <img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab05/main/Ej2_imagenes/eliminacion6.PNG" style="width:85%; height:auto"/>
                                <img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab05/main/Ej2_imagenes/eliminacion7.PNG" style="width:85%; height:auto"/>
                                <img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab05/main/Ej2_imagenes/eliminacion8.PNG" style="width:85%; height:auto"/>
                                <img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab05/main/Ej2_imagenes/eliminacion9.PNG" style="width:85%; height:auto"/>
                                <img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab05/main/Ej2_imagenes/eliminacion10.PNG" style="width:85%; height:auto"/>
            				</center> <br/>
    	        		</ul>
                    </li>
                    <li>Ejercicio 03: Arbol AVL
                    	<ul>
            	            <li>En primer lugar se creó la clase node, en donde tendrá referencia al dato de tipo genérico que se encuentre, asimismo, se creó la referencia al nodo hijo de la derecha, y al de la izquierda, también, su factor de equilibrio o "balanceFactor" y la altura que tendrá según sus nodos hijos. (También se crearon los getters y los setters)</li>
                            <li>Luego se crea la clase AVl que hará uso de la clase Node y tendrá uno de referencia como su raíz. En esta clase, se creará el método de búsqueda para que pueda encontrar algún nodo, y sirve también para que al momento de insertar no se repita el mismo elemento. El método de insertar, agregara un nodo con su dato, de tal manera que cada que agrega se reequilibra el árbol completo; de la misma manera sucede si es que se elimina algún nodo.</li>
                            <li>El equilibrio se basará en 4 tipos de rotación: RSR, RSL, RDR, RDL, los cuales moverán según la teoría y algoritmo de como funciona un AVL (en el ejercicio anterior se puede observar como ocurren estos movimientos), y por cada rotación se asegura de que todo siga equilibrado obteniendo sus factores de equilibrio los cuales no deben ser menores que -1 o mayores que 1.</li>
                            <li>Por último, se crea el método que servirá para imprimir el árbol en inorder, es decir, que se imprimirá primero el subarbol izquierdo, luego la raíz y luego el árbol derecho; ello funcionará para cada subárbol que se encuentre en el AVL.</li>
                            <li>Ejecución según el main de la clase principal.</li>
                            <br/>
                            <center>
                				<img  src="https://raw.githubusercontent.com/mhuamanivar/EDA22A-Individual-Lab05/main/Ej3_imagenes/ej3_ejecucion.PNG" style="width:70%; height:auto"/>
            				</center> <br/>
    	        		</ul>
                    </li> 
                    <br/>
    	        </ol>
            </td>
            </tr>
            <tr><td>II. SOLUCIÓN DEL CUESTIONARIO<br />
                No hubo cuestionario correspondiente a este laboratorio.
            </td>
            </tr>
	    <tr><td>III. CONCLUSIONES<br />
		En conclusión, las pilas nos puede servir de mucha ayuda al querer balancear en situaciones en donde los datos tengan que corresponder a algún otro dato, como por ejemplo, en el caso de los corechetes en el ejercicio1. Además, los arboles AVL es una mejor forma para organizar los datos, puesto que se ha demostrado que al ser un BST se puede optimizar la busqueda de los datos, ya que los de la izquierda siempre serán menores a los de la derecha. Asimismo, cuando se obtiene un AVL, este se equilibrará automáticamente según cada inserción o eliminación de datos, lo que optimizaría el tiempo de ejecución y el resultado por sí mismo.</td>
            </tr>
        </tbody>
    </table>
</div>

<div align="center">
    <table width="1000px">
        <theader>
            <tr><th>RETROALIMENTACIÓN GENERAL</th></tr>
        </theader>
        <tbody>
            <tr height="150px"><td width="1000px"></td></tr>
        </tbody>
    </table>
</div>

<div align="center">
    <table width="1000px">
        <theader>
            <tr><th>REFERENCIAS Y BIBLIOGRAFÍA</th></tr>
        </theader>
        <tbody>
            <tr><td width="1000px">
			<ul>
            	<li><a href="https://algorithmtutor.com/Data-Structures/Tree/AVL-Trees/">https://algorithmtutor.com/Data-Structures/Tree/AVL-Trees/</a></li>
                <li><a href="https://docs.oracle.com/javase/tutorial/java/generics/types.html">https://docs.oracle.com/javase/tutorial/java/generics/types.html</a></li>
                <li><a href="https://youtu.be/aSlCcKL4Xog?list=LL">https://youtu.be/aSlCcKL4Xog?list=LL</a></li>
    		</ul>
	    	</td></tr>
        </tbody>
    </table>
</div>
