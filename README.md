# PracticaObligatoriaT2
  

# **Indíce**
  

0.  **Instalación.**

-  **MENÚ PRINCIPAL.**

1. **QUIENES SOMOS**

2. **FUNCIONAMIENTO DEL MENÚ PRINCIPAL.**

3. **VENTA DE ENTRADAS PARA EL EVENTO.**

- **DESCUENTO**

- **INFORMACIÓN DEL TICKET**

4. **CONSULTAR EL ESTADO DE UN EVENTO**

- **ENTRADAS VENDIDAS DE CADA TIPO**

- **ENTRADAS LIBRES DE CADA TIPO**

- **DÍAS QUE QUEDAN HASTA EL EVENTO Y NOS INFORMA SI ESTAMOS EN EL PERIODO DE DESCUENTO POR EVENTO ANTICIPADA**

5. **MENÚ DE ADMINISTRADOR.**

- **CONSULTAR LOS INGRESOS TOTALES POR EVENTO**

- **CONSULTAR DINERO RESTANTE PARA EL CAMBIO**
  
- **APAGAR EL SOFTWARE**




## **0. INSTALACIÓN**

-Para poder ejecutar nuestro programa debemos el instalar la version más reciente del jkd [ jdk 23.0.1 ] (https://download.oracle.com/java/23/latest/jdk-23_windows-x64_bin.exe), debemos empezar la instalación, debemos 
asegurarnos que lo instalamos en **"C:\Program Files\Java"**, después tenemos que entrar en el **"Panel de Control"** (para entrar podemos meternos en "Configuración" y buscamos panel del control)

![image](https://github.com/user-attachments/assets/f6193364-6f7c-443d-b7f9-b6a01bf6d5cb)

(O podemos darle a la tecla Windows y escribir "Panel de Control")
![image](https://github.com/user-attachments/assets/7eb54ca4-a38f-48dc-b25b-54ec6efacbb9)

Al abrir el Panel de Control le daremos al botón de buscar donde escribiremos **"Variables"**
![image](https://github.com/user-attachments/assets/1cb424e3-51e2-4a2c-8118-95ff2a897d60)

-Pincharemos en el **"Editar las variables de entorno del sistema"**

![image](https://github.com/user-attachments/assets/327f9bd8-2033-42b6-ae07-0cdc5c24a018)

Se nos abrirá la siguiente pestaña y le daremos a **"Variables de entorno..."**

![image](https://github.com/user-attachments/assets/45a4f94e-5035-42a8-ba7b-67b8031e67b7)


-En la sección Variables del sistema busque la variable de entorno **PATH** y selecciónela. Haga clic en Editar. Si no existe la variable de entorno PATH haga clic en Nuevo.

-En la ventana **Editar la variable del sistema** (o **Nueva variable del sistema**), debe especificar el valor de la variable de entorno PATH. Haga clic en **Aceptar**. Cierre todas las demás ventanas haciendo clic en **Aceptar**.

-Para la comprobación le daremos a la letra Windows + R y se nos abrirá la pestaña **Ejecutar** y escribiremos el comando **cmd** y le daremos al botón de **Aceptar.**

![image](https://github.com/user-attachments/assets/6a6f6ac9-57ee-4f29-bdd5-757a992775b8)

-Para ver que todo es correcto escribimos el comando **"javac -version"**, si todo sale bien nos saldrá la versión 23.0.1
![image](https://github.com/user-attachments/assets/f6cf704f-6ec5-4ac4-ba5e-2264612b31c5)

-Para ejecutar nuestro programa nos iremos al enlace de GitHub (https://github.com/jose712020/PracticaObligatoriaT2/tree/main) y le daremos al botón **"<> Code"** donde se desplegará varias opciones, y la 
daremos a **"Download ZIP"**
![image](https://github.com/user-attachments/assets/3a61ba32-6fcb-46ac-8a99-440abf3e57a4)

-Al descargarlo, extraemos la carpeta en la ubicación donde más te convenga, al tenerla extraida nos saldrá lo siguiente, donde ejecutaremos el **"Practica O_T2.bat"** haciendo doble click o dandole click derecho
al ratón y dandole a la opción **"Abrir"**:

![image](https://github.com/user-attachments/assets/0b297c9a-28f7-4f9d-a4ec-810a0a9e243a)


### **MENÚ PRINCIPAL**

-Finalmente tendremos nuestro programa en funcionamiento:

![image](https://github.com/user-attachments/assets/662dcc6a-dbec-4986-92f1-2508f2ee4267)


## 1. **QUIENES SOMOS**

Somos un programa que gestionará las entradas de nuestro Auditorio, donde trabajaremos durante la temporada de Invierno.

-Gestionaremos tres eventos los cuales se llamarán: **Las Criadas** que se realizará el 20/11/2024, **II Concierto de Otoño** que se realizará el 28/11/2024, y finalmente **Concierto de Jazz** que se realizará el 06/12/2024.

## 2. **FUNCIONAMIENTO DEL MENÚ PRINCIPAL.**

Está es la entrada del programa donde tendremos 3 opciones en nuestro menú principal, donde la **opción 'a'** simulará la **Venta de entradas para el evento.**
![image](https://github.com/user-attachments/assets/b49c8df8-934d-4ea0-82b2-726bc0ffc559)

-La **opción 'b'** simulará la **Consultar el estado de los eventos.** 
![image](https://github.com/user-attachments/assets/9fc81156-eef9-45f5-a06e-aa4a576fb542)


-Y finalmente la **opción 'c'** simulará un **Menú de Administrador.**
![image](https://github.com/user-attachments/assets/fb76ebb6-82c1-41b4-b4b9-3bb0f8ca87ec)

En caso de introducir una opción distinta de las opciones a elegir, saltará un mensaje de error, explicando el error del usuario.
![image](https://github.com/user-attachments/assets/5b5d9c88-712b-4f85-9fda-bfb24d89762f)

3. **VENTA DE ENTRADAS PARA EL EVENTO.**

-Venderemos las entradas en esta opción, donde el usuario al elegir la **opción 'a' del Menú Principal**, le llevará a elegir cual de los Tres Eventos desea acceder.

![image](https://github.com/user-attachments/assets/240e0f7b-4313-4743-a59c-c49ef97ea25f)

-Elegiremos alguna de las Tres opciones mostradas en pantalla para **elegir un Evento** específico.

![image](https://github.com/user-attachments/assets/9ec6d60e-b6c4-4b44-b58e-bd68a2adf770)

Al introducir una opción anteriormente, ahora **elegiremos el asiento** para ir a ver el evento elegido anteriormente, nos saldrá que eligamos la **cantidad de entradas** que deseamos para el evento, al introducir la cantidad pedida, ahora nos **pedirá el precio** del dinero que nos tiene que dar el usuario, por último pediremos si quiere introducir una **fecha**, para introducir la fecha tendremos que introducir los datos con el siguiente formato: (YYYY-MM-DD). Pulsaremos un **Enter para continuar**.

- **DESCUENTO**

En caso de comprar la entrada con una fecha de 7 días de antelación se nos aplicará un descuento (Este varía dependiendo del evento). En caso de que el cliente no quiera introducir la fecha la compra se hará en el día actual.

![image](https://github.com/user-attachments/assets/9acb82af-7050-4f7c-993d-06f10b0bbbaf)

Con el dinero que nos ha dado el usuario le entregaremos su Cambio en la menor cantidad posible (Por ejemplo, en caso de que tendramos que devolverle al cliente 20€, en vez de darle 4 billetes de 5€, le daremos solamente 1 billete de 20€). 
Pulsaremos un **Enter para continuar**.

![image](https://github.com/user-attachments/assets/ca0ba577-a30d-4994-9d6b-8231cc98e011)

En caso de que un cliente nos entregue una **Cantidad insuficiente** no se podrá comprar ninguna entrada, y le diremos que la cantidad es insuficiente.

![image](https://github.com/user-attachments/assets/26dd85fd-b496-4dd4-95e0-4c8e988d6f4c)


- **INFORMACIÓN DEL TICKET**
  
Finalmente le daremos al cliente su ticket o sus tickets (dependiendo de la cantidad de tickets que haya comprado). Aquí mostraremos más información sobre la compra que hemos realizado donde se mostrará: El **número de entradas** (Ejemplo: "Esta tu entrada 1 de 3"),
la **Fecha del Evento** donde saldrá la fecha de dicho de evento, el **Tipo de asiento** que será el que hemos elegido anteriormente, un **código de entrada** que lo usaremos para **evitar fraudes**, y finalmente mostraremos el precio final de la entrada.

**Evento: Las Criadas**

![image](https://github.com/user-attachments/assets/5a503d05-43b4-4f04-a78a-99bff4b4d868)

Al ver el siguiente ticket podemos observar como el número de entradas y el código de entrada van cambiando. Pulsaremos un **Enter para continuar**.

![image](https://github.com/user-attachments/assets/ad6752df-4b6c-4490-8ea5-8cddf1acabb8)

**EJEMPLO SIN DESCUENTO CON OTRO ASIENTO**

Introducción de los datos:

![image](https://github.com/user-attachments/assets/bcab28e1-cdd7-4a89-a663-a79d1a06b364)

Ticket pintado:

![image](https://github.com/user-attachments/assets/0fd75441-46fe-4300-9450-e97e2df6f0ab)


**Evento: II Concierto de Otoño**

**CON DESCUENTO**

Introducción de los datos: 

![image](https://github.com/user-attachments/assets/e014cf02-d02a-4d34-9349-936ccc03d9af)

Cambio:

![image](https://github.com/user-attachments/assets/0c1e4cf6-1629-4965-a39a-3d0181a35d1e)

Ticket pintado:

![image](https://github.com/user-attachments/assets/4a7cece9-65c4-4526-95c0-3629489f1551)


**SIN DESCUENTO**

Introducción de los datos: 

![image](https://github.com/user-attachments/assets/f91cdb12-0fae-4c1a-ae9a-7cbf98f4fe30)

Cambio:

![image](https://github.com/user-attachments/assets/37828fee-0e51-4005-bb35-6fd1e0bc7aa6)

Ticket pintado:

![image](https://github.com/user-attachments/assets/e68d7cbd-40e7-497a-80d0-4bbe33320ef4)


**Evento: Concierto de Jazz**

**CON DESCUENTO**

Introdcucción de los datos:

![image](https://github.com/user-attachments/assets/fa19b661-93aa-4550-bb6a-1ba4d3d0f700)

Cambio:

![image](https://github.com/user-attachments/assets/5587d200-9aad-4313-ac62-50c9723a71c0)

Ticket pintado:

![image](https://github.com/user-attachments/assets/8eff35bf-e400-4c68-8755-5e3a71375b96)

**SIN DESCUENTO**

Introdcucción de los datos:

![image](https://github.com/user-attachments/assets/1c659b4d-c866-4c90-8570-670e35912902)

Cambio:

![image](https://github.com/user-attachments/assets/adc23d0e-8ac4-4238-bd6e-4334f7ca5bc2)

Ticket pintado:

![image](https://github.com/user-attachments/assets/1f2b216f-6f10-4249-81a2-79e4daa4effc)


4. **CONSULTAR EL ESTADO DE UN EVENTO**

Aquí mostraremos al cliente un submenú donde podrá consultar en la **opción 'a'** veremos las **Entradas vendidas de un evento**, en la **opción 'b'** veremos las **Entradas libres de cada tipo**, y en la **opción 'c'** veremos los **Días que quedan hasta el evento y si estamos en periodo de descuento por venta anticipada** 

![image](https://github.com/user-attachments/assets/3cbdec20-a356-4ce7-ab87-289147cb9cc5)

En caso de introducir una opción incorrecta, le haremos saber al usuario que la opción es errónea. Pulsaremos un **Enter para continuar**.

![image](https://github.com/user-attachments/assets/643aebef-9fe8-4b20-ac99-3b6e87048032)


- **ENTRADAS VENDIDAS DE CADA TIPO**

En esta opción podremos ver las **entradas vendidas** de cada evento, nos dará a elegir el evento que queremos consultar. 

![image](https://github.com/user-attachments/assets/cfba9fc2-f317-4b92-9b9d-89b400566749)

En caso de introducir una opción incorrecta nos dará un mensaje de error. Pulsaremos un **Enter para continuar**.

![image](https://github.com/user-attachments/assets/e2a35ce9-dc36-4254-b5b6-23ff7d851cad)

Ahora haremos una comprobación de las entradas vendidas de cada evento. Al ver la información, pulsaremos un **Enter para continuar**.

**Evento: Las Criadas**

![image](https://github.com/user-attachments/assets/dfdf4913-af14-45e0-bc59-bf377d894832)

**Evento: II Concierto de Otoño**

![image](https://github.com/user-attachments/assets/71676169-1754-44f0-ac7f-4860fc4df4f3)

**Evento: Concierto de Jazz**

![image](https://github.com/user-attachments/assets/8c11126e-02e6-488c-a208-1c372c71a935)


- **ENTRADAS LIBRES DE CADA TIPO**

En esta opción podremos ver las **entradas libres** que quedan de cada evento, nos saldrá un menú para elegir un evento y hacer la comprobación de entradas libres.

![image](https://github.com/user-attachments/assets/4f84894d-5025-4b88-bd39-d0586e753a21)

Al introducir una opción incorrecta nos lo hará saber.

![image](https://github.com/user-attachments/assets/409defd4-032d-4837-a5e1-de82125895e2)

Ahora haremos una comprobación de las entradas libres de cada evento. Al ver la información, pulsaremos un **Enter para continuar**.

**Evento: Las Criadas**

![image](https://github.com/user-attachments/assets/94762a36-c08e-4c3f-85d0-b5c6ec666efe)

**Evento: II Concierto de Otoño**

![image](https://github.com/user-attachments/assets/28d284a4-5d68-4727-83c7-eb30a95ee846)

**Evento: Concierto de Jazz**

![image](https://github.com/user-attachments/assets/2b168ca8-b3a6-4a75-a5b4-be782cccf69d)


- **DÍAS QUE QUEDAN HASTA EL EVENTO Y NOS INFORMA SI ESTAMOS EN EL PERIODO DE DESCUENTO POR EVENTO ANTICIPADA**

Esta opción nos informará de los **días que quedan hasta el dia del evento** y nos hará saber si estamos en **Periodo de descuento**. Pulsaremos un **Enter para continuar**.

![image](https://github.com/user-attachments/assets/719af2ab-ecf0-4145-92b1-f8bc5bb02886)

5. **MENÚ DE ADMINISTRADOR.**

Esta opción lo que hará es que para acceder al Menú de Administrador tendremos que introducir un **nombre usuario** y **una contraseña**, en caso de que los datos introducidos sean incorrectos nos saldrá el siguiente mensaje:

![image](https://github.com/user-attachments/assets/3b33d209-dc14-4309-9f89-7cdb7c2e2ea3)

**Datos correctos:**

![image](https://github.com/user-attachments/assets/eb129a33-2054-4936-b904-9560ba89c6ba)


En caso de introduccir los datos correctos, habremos conseguido acceder al **Menú de Admistrador**. Donde tendremos la **opción 'i'** que nos enseñará lo **Recolectado de Cada Evento.**, la **opción 'ii'** nos mostrará la **cantidad de billetes y de monedas restantes para el cambio**, y finalmente en la **opción 'iii' Apagaremos el Software.** 

![image](https://github.com/user-attachments/assets/b05efccb-a845-4d13-a48b-4ea1b01e4597)

En caso de introducir una **opción incorrecta** lo sabremos de inmediato, ya que nos hará **volver al Menú Principal.**

![image](https://github.com/user-attachments/assets/06f21f76-1287-4e05-8b39-8d8b6c62c8f8)


- **CONSULTAR LOS INGRESOS TOTALES POR EVENTO**

Podremos consultar en esta opción lo recolectado por cada evento. Pulsaremos un **Enter para continuar**.

![image](https://github.com/user-attachments/assets/9151b498-0fa7-4573-8ab1-bcd7f659de6b)

- **CONSULTAR DINERO RESTANTE PARA EL CAMBIO**

Nos mostrará la cantidad de dinero restante que tendremos para el cambio que le daremos al cliente cuando nos compren las entradas. Pulsaremos un **Enter para continuar**.

![image](https://github.com/user-attachments/assets/d0ca05c3-06d0-4bbd-ac14-191904142e31)

  
- **APAGAR EL SOFTWARE**

Finalmente está opción será la que hará **Apagar el Programa.**

![image](https://github.com/user-attachments/assets/129606de-0c16-44be-925c-778ce961714d)
