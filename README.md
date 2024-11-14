# PracticaObligatoriaT2
  

# **Indíce**
  

0.  **Instalación.**

-  **MENÚ PRINCIPAL.**

1. **QUIENES SOMOS**

2. **FUNCIONAMIENTO DEL MENÚ PRINCIPAL.**

- **VENTA DE ENTRADAS PARA EL EVENTO.**

- **INFORMACIÓN DEL TICKET**

- **MENÚ DE  INICIO DE SESIÓN.**
  

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

- **VENTA DE ENTRADAS PARA EL EVENTO.**

-Venderemos las entradas en esta opción, donde el usuario al elegir la **opción 'a' del Menú Principal**, le llevará a elegir cual de los Tres Eventos desea acceder.

![image](https://github.com/user-attachments/assets/240e0f7b-4313-4743-a59c-c49ef97ea25f)

-Elegiremos alguna de las Tres opciones mostradas en pantalla para **elegir un Evento** específico.

![image](https://github.com/user-attachments/assets/9ec6d60e-b6c4-4b44-b58e-bd68a2adf770)

Al introducir una opción anteriormente, ahora **elegiremos el asiento** para ir a ver el evento elegido anteriormente, nos saldrá que eligamos la **cantidad de entradas** que deseamos para el evento, al introducir la cantidad pedida, ahora nos **pedirá el precio** del dinero que nos tiene que dar el usuario, por último pediremos si quiere introducir una **fecha**, para introducir la fecha tendremos que introducir los datos con el siguiente formato: (YYYY-MM-DD). Pulsaremos un **Enter para continuar**.

![image](https://github.com/user-attachments/assets/9acb82af-7050-4f7c-993d-06f10b0bbbaf)

Con el dinero que nos ha dado el usuario le entregaremos su Cambio en la menor cantidad posible (Por ejemplo, en caso de que tendramos que devolverle al cliente 20€, en vez de darle 4 billetes de 5€, le daremos solamente 1 billete de 20€). 
Pulsaremos un **Enter para continuar**.

![image](https://github.com/user-attachments/assets/ca0ba577-a30d-4994-9d6b-8231cc98e011)

- **INFORMACIÓN DEL TICKET**
  
- Finalmente le daremos al cliente su ticket o sus tickets (dependiendo de la cantidad de tickets que haya comprado). Aquí mostraremos más información sobre la compra que hemos realizado donde se mostrará:
- El número de en
- La **Fecha del Evento** donde se saldrá la fecha de dicho de evento.
-

![image](https://github.com/user-attachments/assets/5a503d05-43b4-4f04-a78a-99bff4b4d868)


- **CONSULTAR EL ESTADO DE LOS EVENTOS.**


- **MENÚ DE  INICIO DE SESIÓN.**

