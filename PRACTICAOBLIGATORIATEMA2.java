import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class PRACTICAOBLIGATORIATEMA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Period entreTiempo;
        LocalDate fechaIntroducida = LocalDate.of(2000, 1, 1), fechaCriadas = LocalDate.of(2024, 11, 20),
                fechaOTO = LocalDate.of(2024, 11, 28),
                fechaJazz = LocalDate.of(2024, 12, 6);


        final String USUARIO = "admin", PASS = "1234";
        final int PRECIOPLATEA_CRIADAS = 17, PRECIOPLATEA_OTO = 12,
                PRECIOPLATEA_JAZZ = 20, PRECIOBUTACAS_CRIADAS = 20, PRECIOBUTACAS_OTO = 15, PRECIOBUTACA_JAZZ = 25,
                PRECIOANFITEATRO_CRIADA = 13, PRECIOANFITEATRO_OTO = 8, PRECIOANFITEATRO_JAZZ = 15;
        final double DESCUENTO_CRIADA = 0.05, DESCUENTO_OTO = 0.07, DESCUENTO_JAZZ = 0.03, IVA = 0.1;


        String op, usuarioIntroducido, passIntroducido, asiento = "", codigoEntrada = "", pintaAsiento = "";
        int entradas = 0, plateasCriadas_Restantes = 140, butacasCriadas_Restantes = 200,
                anfiteatrosCriadas_Restantes = 200, plateasOTO_Restantes = 140, butacasOTO_Restantes = 200,
                anfiteatrosOTO_Restantes = 200, plateasJazz_Restantes = 140, butacasJazz_Restantes = 200,
                anfiteatrosJazz_Restantes = 200, cont = 1, billete500 = 0,
                billete200 = 0, billete100 = 0, billete50 = 0, billete20 = 0, billete10 = 0, billete5 = 0,
                monedas2eu = 0, monedas1eu = 0, monedas50cc = 0, monedas20cc = 0, monedas10cc = 0, monedas5cc = 0,
                monedas2cc = 0, monedas1cc = 0,
                billete500admin = 10000, billete200admin = 10000, billete100admin = 10000, billete50admin = 10000,
                billete20admin = 10000, billete10admin = 10000, billete5admin = 10000, monedas2euadmin = 10000,
                monedas1euadmin = 10000, monedas50ccadmin = 10000, monedas20ccadmin = 10000, monedas10ccadmin = 10000,
                monedas5ccadmin = 10000, monedas2ccadmin = 10000, monedas1ccadmin = 10000;
        double precioTotal = 0, ingresosTotalesCriadas = 0, ingresosTotalesOTO = 0, ingresosTotalesJazz = 0, pintaPrecioSinIva = 0, pintaIVA = 0, precioIva = 0, dineroIntroducido = 0, resto = 0, precioTotalSinIva, precioUnidad = 0;
        boolean apagado = false, descuento = false, criadasTicket = false, oTOTicket = false, jazzTicket = false,
                plateaTicket = false, butacaTicket = false, anfiteatroTicket = false;


        do {
            System.out.print("""
                    
                        ___   __  ______  ____ __________  ____  ________     __  _____  ___   ____________________  ___    __       ____  ______   __  ______    ____ __________ _____
                       /   | / / / / __ \\/ __ /_  __/ __ \\/ __ \\/  _/ __ \\   /  |/  / / / / | / /  _/ ____/  _/ __ \\/   |  / /      / __ \\/ ____/  /  |/  /   |  / __ /_  __/ __ / ___/
                      / /| |/ / / / / / / / / // / / / / / /_/ // // / / /  / /|_/ / / / /  |/ // // /    / // /_/ / /| | / /      / / / / __/    / /|_/ / /| | / /_/ // / / / / \\__ \\\s
                     / ___ / /_/ / /_/ / /_/ // / / /_/ / _, __/ // /_/ /  / /  / / /_/ / /|  _/ // /____/ // ____/ ___ |/ /___   / /_/ / /___   / /  / / ___ |/ _, _// / / /_/ ___/ /\s
                    /_/  |_\\____/_____/\\____//_/  \\____/_/ |_/___/\\____/  /_/  /_/\\____/_/ |_/___/\\____/___/_/   /_/  |_/_____/  /_____/_____/  /_/  /_/_/  |_/_/ |_|/_/  \\____/____/ \s
                                                                                                                                                                                                                    \s
                    
                    
                    a- Vender entradas para un evento.
                    b- Consultar el estado de un evento.
                    c- Menú de Administrador
                    
                    Introduce una opción:\s""");
            op = sc.nextLine().toLowerCase();


            switch (op) { //Switch del Programa Principal
                case "a": //Vender entradas para un evento.
                    do {//Bucle validación opción
                        System.out.print("""
                                Venta de eventos:
                                
                                1- Las Criadas
                                2- II Concierto de Otoño
                                3- Concierto de Jazz
                                
                                Introduce una opción:\s""");


                        op = sc.nextLine();
                        if (!(op.equals("1") || op.equals("2") || op.equals("3"))) {
                            System.out.println("Introduce una opción válida");
                            System.out.println();
                        }
                    } while (!(op.equals("1") || op.equals("2") || op.equals("3")));


                    switch (op) { //Switch principal vender entradas
                        case "1": //LAS CRIADAS
                            for (int i = 0; i < 40; i++) {
                                System.out.println();
                            }
                            System.out.println();
                            do {//Bucle validación opción
                                System.out.print("""
                                        Elige tu asiento para ver Las Criadas:
                                        
                                        1- Platea
                                        2- Butacas
                                        3- Anfiteatro
                                        
                                        Introduce el tipo asiento deseado:\s""");
                                asiento = sc.nextLine();
                                if (!(asiento.equals("1") || asiento.equals("2") || asiento.equals("3"))) {
                                    System.out.println("Introduce una opción válida");
                                    System.out.println();
                                }
                            } while (!(asiento.equals("1") || asiento.equals("2") || asiento.equals("3")));


                            System.out.print("Introduce la cantidad de entradas que quieras: ");
                            entradas = Integer.parseInt(sc.nextLine());


                            System.out.print("Introduce la cantidad de dinero para comprar (solo numeros -> (23.71)): ");
                            dineroIntroducido = Float.parseFloat(sc.nextLine());


                            do {//Bucle validación FECHA
                                System.out.print("¿Quiere introducir una fecha?(si/no): ");
                                op = sc.nextLine();
                                if (op.equalsIgnoreCase("no")) {//Si no queremos simular día
                                    fechaIntroducida = LocalDate.now();
                                } else if (op.equalsIgnoreCase("si")) {//Sí queremos simular día
                                    System.out.println("Introduce una fecha (YYYY-MM-DD): ");
                                    fechaIntroducida = LocalDate.parse(sc.nextLine());
                                } else {//Si algo introducido no es válido
                                    for (int i = 0; i < 30; i++) {
                                        System.out.println();
                                    }
                                    System.out.println("Valor no válido, vuelve a intentarlo");
                                }
                            } while (!(op.equals("si") || op.equals("no")));


                            entreTiempo = Period.between(fechaIntroducida, fechaCriadas);
                            if (entreTiempo.getMonths() == 0 && entreTiempo.getYears() == 0 && entreTiempo.getDays() >= 7)
                                descuento = true;
                            else descuento = false;


                            switch (asiento) {//Tipo de asiento en criadas
                                case "1"://Calculamos el precio de la platea en criadas
                                    if (entradas > plateasCriadas_Restantes) {
                                        System.out.println("NO HAY MÁS PLATEAS DISPONIBLES PARA LAS ENTRADAS DESEADAS");
                                        criadasTicket = false;
                                    } else {//Si hay plateas disponibles
                                        criadasTicket = true;
                                        plateaTicket = true;
                                        precioTotalSinIva = entradas * PRECIOPLATEA_CRIADAS;
                                        precioIva = precioTotalSinIva * IVA;
                                        precioTotal = precioTotalSinIva + precioIva;
                                        if (descuento)
                                            precioTotal = (precioTotalSinIva - (precioTotalSinIva * DESCUENTO_CRIADA)) + (precioIva);
                                        if (dineroIntroducido < precioTotal) {
                                            System.out.println("Cantidad introducida insuficiente");
                                            criadasTicket = false;
                                        } else {
                                            plateasCriadas_Restantes -= entradas;
                                            resto = dineroIntroducido - precioTotal;
                                            ingresosTotalesCriadas += precioTotal;
                                        }
                                    }


                                    System.out.println("Pulsa una tecla para continuar...");
                                    sc.nextLine();
                                    for (int i = 0; i < 50; i++) {
                                        System.out.println();
                                    }


                                    break;
                                case "2": //Calculamos el precio de la butaca en criadas
                                    if (entradas > butacasCriadas_Restantes) {
                                        System.out.println("NO HAY MÁS BUTACAS DISPONIBLES PARA LAS ENTRADAS DESEADAS");
                                        criadasTicket = false;
                                    } else {//Si hay butacas disponibles
                                        criadasTicket = true;
                                        butacaTicket = true;
                                        precioTotalSinIva = entradas * PRECIOBUTACAS_CRIADAS;
                                        precioIva = precioTotalSinIva * IVA;
                                        precioTotal = precioTotalSinIva + precioIva;
                                        if (descuento)
                                            precioTotal = (precioTotalSinIva - (precioTotalSinIva * DESCUENTO_CRIADA)) + (precioIva);
                                        if (dineroIntroducido < precioTotal) {
                                            System.out.println("Cantidad introducida insuficiente");
                                            criadasTicket = false;
                                        } else {
                                            butacasCriadas_Restantes -= entradas;
                                            resto = dineroIntroducido - precioTotal;
                                            ingresosTotalesCriadas += precioTotal;
                                        }


                                    }
                                    System.out.println("Pulsa una tecla para continuar...");
                                    sc.nextLine();
                                    for (int i = 0; i < 50; i++) {
                                        System.out.println();
                                    }
                                    break;
                                case "3": //Calculamos el precio del anfiteatro en criadas
                                    if (entradas > anfiteatrosCriadas_Restantes) {
                                        System.out.println("NO HAY MÁS ANFITEATROS DISPONIBLES PARA LAS ENTRADAS DESEADAS");
                                        criadasTicket = false;
                                    } else {//Si hay anfiteatros disponibles
                                        criadasTicket = true;
                                        anfiteatroTicket = true;
                                        precioTotalSinIva = entradas * PRECIOANFITEATRO_CRIADA;
                                        precioIva = precioTotalSinIva * IVA;
                                        precioTotal = precioTotalSinIva + precioIva;
                                        if (descuento)
                                            precioTotal = (precioTotalSinIva - (precioTotalSinIva * DESCUENTO_CRIADA)) + (precioIva);
                                        if (dineroIntroducido < precioTotal) {
                                            System.out.println("Cantidad introducida insuficiente");
                                            criadasTicket = false;
                                        } else {
                                            anfiteatrosCriadas_Restantes -= entradas;
                                            resto = dineroIntroducido - precioTotal;
                                            ingresosTotalesCriadas += precioTotal;
                                        }
                                    }
                                    System.out.println("Pulsa una tecla para continuar...");
                                    sc.nextLine();
                                    for (int i = 0; i < 50; i++) {
                                        System.out.println();
                                    }
                                    break;


                            }
                            precioTotal = 0;
                            break; //Fin Las Criadas


                        case "2": //II Concierto de Otoño
                            for (int i = 0; i < 40; i++) {
                                System.out.println();
                            }
                            System.out.println();
                            do {//Bucle validación opción
                                System.out.print("""
                                        Elige tu asiento para ver II Concierto de Otoño:
                                        
                                        1- Platea
                                        2- Butacas
                                        3- Anfiteatro
                                        
                                        Introduce el tipo asiento deseado:\s""");
                                asiento = sc.nextLine();
                                if (!(asiento.equals("1") || asiento.equals("2") || asiento.equals("3"))) {
                                    System.out.println("Introduce una opción válida");
                                    System.out.println();
                                }
                            } while (!(asiento.equals("1") || asiento.equals("2") || asiento.equals("3")));


                            System.out.print("Introduce la cantidad de entradas que quieras: ");
                            entradas = Integer.parseInt(sc.nextLine());


                            System.out.print("Introduce la cantidad de dinero para comprar (solo numeros -> (23.71)): ");
                            dineroIntroducido = Float.parseFloat(sc.nextLine());


                            do {//Bucle validación FECHA II Concierto de Otoño
                                System.out.print("¿Quiere introducir una fecha?(si/no): ");
                                op = sc.nextLine();
                                if (op.equalsIgnoreCase("no")) { //Si no queremos simular día
                                    fechaIntroducida = LocalDate.now();
                                } else if (op.equalsIgnoreCase("si")) {
                                    System.out.println("Introduce una fecha (YYYY-MM-DD): ");
                                    fechaIntroducida = LocalDate.parse(sc.nextLine());
                                } else {
                                    for (int i = 0; i < 30; i++) {
                                        System.out.println();
                                    }
                                    System.out.println("Valor no válido, vuelve a intentarlo");
                                }
                            } while (!(op.equals("si") || op.equals("no")));


                            entreTiempo = Period.between(fechaIntroducida, fechaOTO);
                            if (entreTiempo.getMonths() == 0 && entreTiempo.getYears() == 0 && entreTiempo.getDays() >= 7)
                                descuento = true;
                            else descuento = false;


                            switch (asiento) {//Tipo de asiento en II Concierto de Otoño
                                case "1"://Calculamos el precio de la platea en II Concierto de Otoño
                                    if (entradas > plateasOTO_Restantes) {
                                        System.out.println("NO HAY MÁS PLATEAS DISPONIBLES PARA LAS ENTRADAS DESEADAS");
                                        oTOTicket = false;
                                    } else {//Si hay plateas disponibles
                                        oTOTicket = true;
                                        plateaTicket = true;
                                        precioTotalSinIva = entradas * PRECIOPLATEA_OTO;
                                        precioIva = precioTotalSinIva * IVA;
                                        precioTotal = precioTotalSinIva + precioIva;
                                        if (descuento)
                                            precioTotal = (precioTotalSinIva - (precioTotalSinIva * DESCUENTO_OTO)) + (precioIva);
                                        if (dineroIntroducido < precioTotal) {
                                            System.out.println("Cantidad introducida insuficiente");
                                            oTOTicket = false;
                                        } else {
                                            plateasOTO_Restantes -= entradas;
                                            resto = dineroIntroducido - precioTotal;
                                            ingresosTotalesOTO += precioTotal;
                                        }
                                    }


                                    System.out.println("Pulsa una tecla para continuar...");
                                    sc.nextLine();
                                    for (int i = 0; i < 50; i++) {
                                        System.out.println();
                                    }
                                    break;


                                case "2": //Calculamos el precio de las butacas en II Concierto de Otoño
                                    if (entradas > butacasOTO_Restantes) {
                                        System.out.println("NO HAY MÁS BUTACAS DISPONIBLES PARA LAS ENTRADAS DESEADAS");
                                        oTOTicket = false;
                                    } else {//Si hay butacas disponibles
                                        oTOTicket = true;
                                        butacaTicket = true;
                                        precioTotalSinIva = entradas * PRECIOBUTACAS_OTO;
                                        precioIva = precioTotalSinIva * IVA;
                                        precioTotal = precioTotalSinIva + precioIva;
                                        if (descuento)
                                            precioTotal = (precioTotalSinIva - (precioTotalSinIva * DESCUENTO_OTO)) + (precioIva);
                                        if (dineroIntroducido < precioTotal) {
                                            System.out.println("Cantidad introducida insuficiente");
                                            oTOTicket = false;
                                        } else {
                                            butacasOTO_Restantes -= entradas;
                                            resto = dineroIntroducido - precioTotal;
                                            ingresosTotalesOTO += precioTotal;
                                        }
                                    }
                                    System.out.println("Pulsa una tecla para continuar...");
                                    sc.nextLine();
                                    for (int i = 0; i < 50; i++) {
                                        System.out.println();
                                    }
                                    break;


                                case "3": //Calculamos el precio del anfiteatro en II Concierto de Otoño
                                    if (entradas > anfiteatrosOTO_Restantes) {
                                        System.out.println("NO HAY MÁS ANFITEATROS DISPONIBLES PARA LAS ENTRADAS DESEADAS");
                                        oTOTicket = false;
                                    } else {//Si hay anfiteatros disponibles
                                        oTOTicket = true;
                                        anfiteatroTicket = true;
                                        precioTotalSinIva = entradas * PRECIOANFITEATRO_OTO;
                                        precioIva = precioTotalSinIva * IVA;
                                        precioTotal = precioTotalSinIva + precioIva;
                                        if (descuento)
                                            precioTotal = (precioTotalSinIva - (precioTotalSinIva * DESCUENTO_OTO)) + (precioIva);
                                        if (dineroIntroducido < precioTotal) {
                                            System.out.println("Cantidad introducida insuficiente");
                                            oTOTicket = false;
                                        } else {
                                            anfiteatrosOTO_Restantes -= entradas;
                                            resto = dineroIntroducido - precioTotal;
                                            ingresosTotalesOTO += precioTotal;
                                        }
                                    }
                                    System.out.println("Pulsa una tecla para continuar...");
                                    sc.nextLine();
                                    for (int i = 0; i < 50; i++) {
                                        System.out.println();
                                    }
                                    break;
                            }
                            precioTotal = 0;
                            break; //Fin II Concierto de Otoño


                        case "3": //Concierto de Jazz
                            for (int i = 0; i < 40; i++) {
                                System.out.println();
                            }
                            System.out.println();
                            do {//Bucle validación opción
                                System.out.print("""
                                        Elige tu asiento para ver Concierto de Jazz:
                                        
                                        1- Platea
                                        2- Butacas
                                        3- Anfiteatro
                                        
                                        Introduce el tipo asiento deseado:\s""");
                                asiento = sc.nextLine();
                                if (!(asiento.equals("1") || asiento.equals("2") || asiento.equals("3"))) {
                                    System.out.println("Introduce una opción válida");
                                    System.out.println();
                                }
                            } while (!(asiento.equals("1") || asiento.equals("2") || asiento.equals("3")));


                            System.out.print("Introduce la cantidad de entradas que quieras: ");
                            entradas = Integer.parseInt(sc.nextLine());


                            System.out.print("Introduce la cantidad de dinero para comprar (solo numeros -> (23.71)): ");
                            dineroIntroducido = Float.parseFloat(sc.nextLine());


                            do {//Bucle validación FECHA Concierto Jazz
                                System.out.print("¿Quiere introducir una fecha?(si/no): ");
                                op = sc.nextLine();
                                if (op.equalsIgnoreCase("no")) {
                                    fechaIntroducida = LocalDate.now();
                                } else if (op.equalsIgnoreCase("si")) {
                                    System.out.println("Introduce una fecha (YYYY-MM-DD): ");
                                    fechaIntroducida = LocalDate.parse(sc.nextLine());
                                } else {
                                    for (int i = 0; i < 30; i++) {
                                        System.out.println();
                                    }
                                    System.out.println("Valor no válido, vuelve a intentarlo");
                                }
                            } while (!(op.equals("si") || op.equals("no")));


                            entreTiempo = Period.between(fechaIntroducida, fechaJazz);
                            if (entreTiempo.getMonths() == 0 && entreTiempo.getYears() == 0 && entreTiempo.getDays() >= 7)
                                descuento = true;
                            else descuento = false;


                            switch (asiento) {//Tipo de asiento en Concierto de Jazz
                                case "1"://Calculamos el precio de la platea en Concierto de Jazz
                                    if (entradas > plateasJazz_Restantes) {
                                        System.out.println("NO HAY MÁS PLATEAS DISPONIBLES PARA LAS ENTRADAS DESEADAS");
                                        jazzTicket = false;
                                    } else {//Si hay plateas disponibles
                                        jazzTicket = true;
                                        plateaTicket = true;
                                        precioTotalSinIva = entradas * PRECIOPLATEA_JAZZ;
                                        precioIva = precioTotalSinIva * IVA;
                                        precioTotal = precioTotalSinIva + precioIva;
                                        if (descuento)
                                            precioTotal = (precioTotalSinIva - (precioTotalSinIva * DESCUENTO_JAZZ)) + (precioIva);
                                        if (dineroIntroducido < precioTotal) {
                                            System.out.println("Cantidad introducida insuficiente");
                                            jazzTicket = false;
                                        } else {
                                            plateasJazz_Restantes -= entradas;
                                            resto = dineroIntroducido - precioTotal;
                                            ingresosTotalesJazz += precioTotal;
                                        }
                                    }


                                    System.out.println("Pulsa una tecla para continuar...");
                                    sc.nextLine();
                                    for (int i = 0; i < 50; i++) {
                                        System.out.println();
                                    }
                                    ingresosTotalesJazz += precioTotal;
                                    break;
                                case "2": //Calculamos el precio de las butacas en Concierto de Jazz
                                    if (entradas > butacasJazz_Restantes) {
                                        System.out.println("NO HAY MÁS BUTACAS DISPONIBLES PARA LAS ENTRADAS DESEADAS");
                                        jazzTicket = false;
                                    } else {//Si hay butacas disponibles
                                        jazzTicket = true;
                                        butacaTicket = true;
                                        precioTotalSinIva = entradas * PRECIOBUTACA_JAZZ;
                                        precioIva = precioTotalSinIva * IVA;
                                        precioTotal = precioTotalSinIva + precioIva;
                                        if (descuento)
                                            precioTotal = (precioTotalSinIva - (precioTotalSinIva * DESCUENTO_JAZZ)) + (precioIva);
                                        if (dineroIntroducido < precioTotal) {
                                            System.out.println("Cantidad introducida insuficiente");
                                            jazzTicket = false;
                                        } else {
                                            butacasJazz_Restantes -= entradas;
                                            resto = dineroIntroducido - precioTotal;
                                            ingresosTotalesJazz += precioTotal;
                                        }


                                    }
                                    System.out.println("Pulsa una tecla para continuar...");
                                    sc.nextLine();
                                    for (int i = 0; i < 50; i++) {
                                        System.out.println();
                                    }
                                    break;
                                case "3": //Calculamos el precio del anfiteatro en Concierto de Jazz
                                    if (entradas > anfiteatrosJazz_Restantes) {
                                        System.out.println("NO HAY MÁS ANFITEATROS DISPONIBLES PARA LAS ENTRADAS DESEADAS");
                                        jazzTicket = false;
                                    } else {//Si hay anfiteatros disponibles
                                        jazzTicket = true;
                                        anfiteatroTicket = true;
                                        precioTotalSinIva = entradas * PRECIOANFITEATRO_JAZZ;
                                        precioIva = precioTotalSinIva * IVA;
                                        precioTotal = precioTotalSinIva + precioIva;
                                        if (descuento)
                                            precioTotal = (precioTotalSinIva - (precioTotalSinIva * DESCUENTO_JAZZ)) + (precioIva);
                                        if (dineroIntroducido < precioTotal) {
                                            System.out.println("Cantidad introducida insuficiente");
                                            jazzTicket = false;
                                        } else {
                                            anfiteatrosJazz_Restantes -= entradas;
                                            resto = dineroIntroducido - precioTotal;
                                            ingresosTotalesJazz += precioTotal;
                                        }


                                    }
                                    System.out.println("Pulsa una tecla para continuar...");
                                    sc.nextLine();
                                    for (int i = 0; i < 50; i++) {
                                        System.out.println();
                                    }
                                    break;
                            }
                            precioTotal = 0;
                            break; //Fin Concierto de Jazz
                    }


                    //En caso de volver aquí reseteamos las variables
                    billete500 = 0;
                    billete200 = 0;
                    billete100 = 0;
                    billete50 = 0;
                    billete20 = 0;
                    billete10 = 0;
                    billete5 = 0;
                    monedas2eu = 0;
                    monedas1eu = 0;
                    monedas50cc = 0;
                    monedas20cc = 0;
                    monedas10cc = 0;
                    monedas5cc = 0;
                    monedas2cc = 0;
                    monedas1cc = 0;


                    if (resto > 0) {//Calculamos los billetes necesarios
                        System.out.printf("Resto: %.2f€, su cambio es: \n", resto);
                        if (resto >= 500) {
                            do {
                                resto -= 500;
                                resto = Math.round(resto * 100.0) / 100.0; // Redondeo a 2 decimales
                                billete500++;
                                billete500admin--;
                            } while (resto >= 500);
                            System.out.println("Cantidad de billetes de 500: " + billete500);
                        }
                        if (resto >= 200) {
                            do {
                                resto -= 200;
                                resto = Math.round(resto * 100.0) / 100.0;
                                billete200++;
                                billete200admin--;
                            } while (resto >= 200);
                            System.out.println("Cantidad de billetes de 200: " + billete200);
                        }
                        if (resto >= 100) {
                            do {
                                resto -= 100;
                                resto = Math.round(resto * 100.0) / 100.0;
                                billete100++;
                                billete100admin--;
                            } while (resto >= 100);
                            System.out.println("Cantidad de billetes de 100: " + billete100);
                        }
                        if (resto >= 50) {
                            do {
                                resto -= 50;
                                resto = Math.round(resto * 100.0) / 100.0;
                                billete50++;
                                billete50admin--;
                            } while (resto >= 50);
                            System.out.println("Cantidad de billetes de 50: " + billete50);
                        }
                        if (resto >= 20) {
                            do {
                                resto -= 20;
                                resto = Math.round(resto * 100.0) / 100.0;
                                billete20++;
                                billete20admin--;
                            } while (resto >= 20);
                            System.out.println("Cantidad de billetes de 20: " + billete20);
                        }
                        if (resto >= 10) {
                            do {
                                resto -= 10;
                                resto = Math.round(resto * 100.0) / 100.0;
                                billete10++;
                                billete10admin--;
                            } while (resto >= 10);
                            System.out.println("Cantidad de billetes de 10: " + billete10);
                        }
                        if (resto >= 5) {
                            do {
                                resto -= 5;
                                resto = Math.round(resto * 100.0) / 100.0;
                                billete5++;
                                billete5admin--;
                            } while (resto >= 5);
                            System.out.println("Cantidad de billetes de 5: " + billete5);
                        }
                        if (resto >= 2) {
                            do {
                                resto -= 2;
                                resto = Math.round(resto * 100.0) / 100.0;
                                monedas2eu++;
                                monedas2euadmin--;
                            } while (resto >= 2);
                            System.out.println("Cantidad de monedas de 2 euros: " + monedas2eu);
                        }
                        if (resto >= 1) {
                            resto -= 1;
                            resto = Math.round(resto * 100.0) / 100.0;
                            monedas1eu++;
                            monedas1euadmin--;
                            System.out.println("Cantidad de monedas de 1 euros: " + monedas1eu);
                        }
                        if (resto >= 0.50) {
                            resto -= 0.50;
                            resto = Math.round(resto * 100.0) / 100.0;
                            monedas50cc++;
                            monedas50ccadmin--;
                            System.out.println("Cantidad de monedas de 50 céntimos: " + monedas50cc);
                        }
                        if (resto >= 0.20) {
                            do {
                                resto -= 0.20;
                                resto = Math.round(resto * 100.0) / 100.0;
                                monedas20cc++;
                                monedas20ccadmin--;
                            } while (resto >= 0.20);
                            System.out.println("Cantidad de monedas de 20 céntimos: " + monedas20cc);
                        }
                        if (resto >= 0.10) {
                            resto -= 0.10;
                            resto = Math.round(resto * 100.0) / 100.0;
                            monedas10cc++;
                            monedas10ccadmin--;
                            System.out.println("Cantidad de monedas de 10 céntimos: " + monedas10cc);
                        }
                        if (resto >= 0.05) {
                            resto -= 0.05;
                            resto = Math.round(resto * 100.0) / 100.0;
                            monedas5cc++;
                            monedas5ccadmin--;
                            System.out.println("Cantidad de monedas de 5 céntimos: " + monedas5cc);
                        }
                        if (resto >= 0.02) {
                            do {
                                resto -= 0.02;
                                resto = Math.round(resto * 100.0) / 100.0;
                                monedas2cc++;
                                monedas2ccadmin--;
                            } while (resto >= 0.02);
                            System.out.println("Cantidad de monedas de 2 céntimos: " + monedas2cc);
                        }
                        if (resto >= 0.01) {
                            resto -= 0.01;
                            resto = Math.round(resto * 100.0) / 100.0;
                            monedas1cc++;
                            monedas1ccadmin--;
                            System.out.println("Cantidad de monedas de 1 céntimos: " + monedas1cc);
                        }


                        System.out.println("Pulsa una tecla para continuar...");
                        sc.nextLine();
                        for (int i = 0; i < 50; i++) {
                            System.out.println();
                        }


                    }


                    //Imprimimos el ticket de Las criadas
                    if (criadasTicket) {
                        for (cont = 1; cont <= entradas; cont++) {
                            for (int j = 0; j < 20; j++) {
                                System.out.println();
                            }
                            if (criadasTicket && plateaTicket) {
                                codigoEntrada = "plaCRI2011".concat(String.valueOf(140 - plateasCriadas_Restantes).concat(String.valueOf(cont)));
                                pintaAsiento = "Platea";
                                if (descuento) {
                                    pintaPrecioSinIva = PRECIOPLATEA_CRIADAS - PRECIOPLATEA_CRIADAS * DESCUENTO_CRIADA;
                                } else {
                                    pintaPrecioSinIva = PRECIOPLATEA_CRIADAS;
                                }
                                pintaIVA = PRECIOPLATEA_CRIADAS * IVA;
                                precioUnidad = pintaPrecioSinIva + pintaIVA;
                            }
                            if (criadasTicket && butacaTicket) {
                                codigoEntrada = "butCRI2011".concat(String.valueOf(200 - butacasCriadas_Restantes).concat(String.valueOf(cont)));
                                pintaAsiento = "Butaca";
                                if (descuento) {
                                    pintaPrecioSinIva = PRECIOBUTACAS_CRIADAS - PRECIOBUTACAS_CRIADAS * DESCUENTO_CRIADA;
                                } else {
                                    pintaPrecioSinIva = PRECIOBUTACAS_CRIADAS;
                                }
                                pintaIVA = PRECIOBUTACAS_CRIADAS * IVA;
                                precioUnidad = pintaPrecioSinIva + pintaIVA;
                            }
                            if (criadasTicket && anfiteatroTicket) {
                                codigoEntrada = "anfiCRI2011".concat(String.valueOf(200 - anfiteatrosCriadas_Restantes).concat(String.valueOf(cont)));
                                pintaAsiento = "Anfiteatro";
                                if (descuento) {
                                    pintaPrecioSinIva = PRECIOANFITEATRO_CRIADA - PRECIOANFITEATRO_CRIADA * DESCUENTO_CRIADA;
                                } else {
                                    pintaPrecioSinIva = PRECIOANFITEATRO_CRIADA;
                                }
                                pintaIVA = PRECIOANFITEATRO_CRIADA * IVA;
                                precioUnidad = pintaPrecioSinIva + pintaIVA;
                            }


                            //System.out.println("precioTotal = " + precioTotal);
                            System.out.printf("""
                                            
                                            Esta es tu entrada %d de %d
                                            LAS CRIADAS
                                            ******************************************************************************************************************************************
                                               Fecha evento: 20-11-2024
                                                                                     .=-++=. .:::---**+=-::::::....=#****+. :--===***+=-:::----:=----:=+=:..:::-:::---::..:::::-:.    \s
                                                                                     .:---. .:...::-=--..::::::....:::::. ......::::::::::----:==:..::::.......:::::......::::::.     \s
                                                                                     ....   .............:::::::........  .............:::-----:::........................:::::::.    \s
                                                                                      ..   ..... .......::::::::....      ..::..   ....:::-----::. ......................::::::::.    \s
                                                                                     ..    .....   ....::::::::--...  .....:..-.......:::-----::.  ..... ...............:::::::::.    \s
                                                                                     .    ....:.......::::::::::-.....:....:-:-:.....::::---::::   ............:.......:::::::::.     \s
                                                                                      .....:=:::.....::::::::::::....:..::-----::....::::--:::::    ......:-=-:........:::::::::.     \s
                                                                                      ..  .:-::......::::::::::::.........::::::.....:::::::::::     ....:--::......:..:::::::::.     \s
                                                                                       .  ...........:::::::::::. .....:::::::::::...::::::::::::     ....:........::::::::::::..     \s
                                                                                       ..::::----:::..::::::::::.  ...:::--=-==--:...::::::::::-.      ..:::::::--:::.:::::::...      \s
                                                                                       ....:::::::::..:::::::::-.  .....::--::::..::.:::::::::-.        .::--::::::::.:::::....       \s
                                                                                        .............:::::::::::   .......::::::::::::::::::-:.          ...::::::.::::::.....        \s
                                                                                          .    .........:::..       ............:::::::::---:             ..........::::......        \s
                                                                                          ............:..             .......:::::::::-----.               .........::......          \s
                                                                                            ..........                 ...:::::::::::--=-:                  .............             \s
                                                                                                                         .::::::::-----.                     ..........               \s
                                                                                                                           .:::::::..                                                 \s
                                                                                                                                                                                      \s
                                               Tipo de asiento: %S                                                                                                                    \s
                                                                                                                                                                                      \s
                                                                                                                                                                                      \s
                                                                                      :--.      .-    .-:-:      :-:--:.-----.  :--:    -.   .---:-:.    .-    .-:-:                  \s
                                                                                      .*=       +*.   *=  -    .*=   .- -*. **   **    :*+    =*. .=*-  .+*.  .*-  -                  \s
                                                                                      .*=      -.*+   +*+:     +*.      -*..*+   **   .=-*:   =*.   +*. -.*+   +*=:                   \s
                                                                                      .*=     .+-+*:   :=*+    +*.      -*-+*.   **   =--*+   =*.   +*..+-+*:   :=*+                  \s
                                                                                      .*=  .- +.  *+ ::  =*    :*=   .= -*..*+.  **  :=  -*-  =*.  -*- +  .*+ -:  =*                  \s
                                                                                     .=**==+-=+: .+*=:+==+.     .=+-=+-:+*=..++:-**-:+=. -*+-:+*+===..=+: :+*=:*==+.   \s
                                               Código de entrada: %S
                                                                                     Precio entrada: %.2f€ + IVA 10 = %.2f€ = %.2f€
                                            ******************************************************************************************************************************************\n\n\n"""
                                    , cont, entradas, pintaAsiento, codigoEntrada, pintaPrecioSinIva, pintaIVA, precioUnidad);


                            if (entradas > 1) {//Muestra mensaje de pulsar enter si se ha comprado más de una entrada
                                System.out.print("Pulsa Enter para ver la siguiente entrada...");
                                sc.nextLine();
                            } else {
                                System.out.print("Pulsa una tecla para continuar...");
                                sc.nextLine();
                            }
                            for (int j = 0; j < 50; j++) {
                                System.out.println();
                            }
                        }
                    }


                    //Imprimimos el ticket de II Concierto de Otoño
                    if (oTOTicket) {
                        for (cont = 1; cont <= entradas; cont++) {
                            for (int j = 0; j < 20; j++) {
                                System.out.println();
                            }
                            if (oTOTicket && plateaTicket) {
                                codigoEntrada = "plaOTO2011".concat(String.valueOf(140 - plateasOTO_Restantes).concat(String.valueOf(cont)));
                                pintaAsiento = "Platea";
                                if (descuento) {
                                    pintaPrecioSinIva = PRECIOPLATEA_OTO - PRECIOPLATEA_OTO * DESCUENTO_OTO;
                                } else {
                                    pintaPrecioSinIva = PRECIOPLATEA_OTO;
                                }
                                pintaIVA = PRECIOPLATEA_OTO * IVA;
                                precioUnidad = pintaPrecioSinIva + pintaIVA;
                            }
                            if (oTOTicket && butacaTicket) {
                                codigoEntrada = "butOTO2011".concat(String.valueOf(200 - butacasOTO_Restantes).concat(String.valueOf(cont)));
                                pintaAsiento = "Butaca";
                                if (descuento) {
                                    pintaPrecioSinIva = PRECIOBUTACAS_OTO - PRECIOBUTACAS_OTO * DESCUENTO_OTO;
                                } else {
                                    pintaPrecioSinIva = PRECIOBUTACAS_OTO;
                                }
                                pintaIVA = PRECIOBUTACAS_OTO * IVA;
                                precioUnidad = pintaPrecioSinIva + pintaIVA;
                            }
                            if (oTOTicket && anfiteatroTicket) {
                                codigoEntrada = "anfiOTO2011".concat(String.valueOf(200 - anfiteatrosOTO_Restantes).concat(String.valueOf(cont)));
                                pintaAsiento = "Anfiteatro";
                                if (descuento) {
                                    pintaPrecioSinIva = PRECIOANFITEATRO_OTO - PRECIOANFITEATRO_OTO * DESCUENTO_OTO;
                                } else {
                                    pintaPrecioSinIva = PRECIOANFITEATRO_OTO;
                                }
                                pintaIVA = PRECIOANFITEATRO_OTO * IVA;
                                precioUnidad = pintaPrecioSinIva + pintaIVA;
                            }


                            //System.out.println("precioTotal = " + precioTotal);
                            System.out.printf("""
                                            
                                            Esta es tu entrada %d de %d
                                            II Concierto de Otoño
                                            ***************************************************************************************************************************************************
                                               Fecha evento: 28-11-2024
                                                                                                             ,
                                                                                                             }`-.   ,          ,
                                                                                                             \\ \\ '-' \\      .-'{
                                                                                                          _} .  | ,`\\   /  ' ;    .-;\\
                                                                                                         {    \\ |    | / `/  '-.,/ ; |
                                                                                                         { -- -.  '  '`-, .--._.' ;  \\__
                                                                                                             \\     \\ | '  /  |`.    ;    _,`\\
                                                                                                             '. '-     ' `_- '.`;  ; ,-`_.-'
                                                                                                          ,--.  \\    `   /` '--'  `;.` (`  _
                                                                                                     .--.\\  '._) '-. \\ \\ `-.    ;     `-';| \s
                                                                                                 '. -. '         __ '.  ;  ;     _,-' /
                                                                                                     { __'.\\  ' '-,/; `-'   ';`.- `   .-'
                                                                                                         '-.  `-._'  | `;     ;`'   .-'`
                                                                                                         <_ -'   ` .\\  `;  ;     (_.'`\\
                                                                                                         _.;-"``"'-._'. `:;  ___, _.-' |
                                                                                                     .-'\\'. '.` \\ \\_,_`\\ ;##`   `';  _.'
                                                                                                     /_'._\\ \\  \\__;#####./###.      \\`
                                                                                                     \\.' .'`/"`/ (#######)###::.. _.'
                                                                                                     '.' .'  ; , |:.  `|()##`""\"`
                                                                                                     jgs `'-../__/_\\::   /O()()o
                                                                                                                 ()'._.'`()()'
                                                                                                                                                                                      \s
                                               Tipo de asiento: %S                                                                                                                    \s
                                                                                                                                                                                      \s
                                                                                                                                                                                      \s
                                                                                   ####     ####               ####    #####   ##   ##    ####    ####    #######  ######   ######    #####
                                                                                    ##       ##               ##  ##  ##   ##  ###  ##   ##  ##    ##      ##   #   ##  ##  # ## #   ##   ##
                                                                                    ##       ##              ##       ##   ##  #### ##  ##         ##      ## #     ##  ##    ##     ##   ##   \s
                                                                                    ##       ##              ##       ##   ##  ## ####  ##         ##      ####     #####     ##     ##   ##    \s
                                                                                    ##       ##              ##       ##   ##  ##  ###  ##         ##      ## #     ## ##     ##     ##   ## \s
                                                                                    ##       ##               ##  ##  ##   ##  ##   ##   ##  ##    ##      ##   #   ##  ##    ##     ##   ## \s
                                                                                   ####     ####               ####    #####   ##   ##    ####    ####    #######  #### ##   ####     ##### \s
                                                                                 \s
                                                                                                                                          #######
                                                                                    #####    #######            #####   ######    #####   ##   ##   #####
                                                                                     ## ##    ##   #           ##   ##  # ## #   ##   ##  ###  ##  ##   ##
                                                                                     ##  ##   ## #             ##   ##    ##     ##   ##  #### ##  ##   ##
                                                                                     ##  ##   ####             ##   ##    ##     ##   ##  ## ####  ##   ##
                                                                                     ##  ##   ## #             ##   ##    ##     ##   ##  ##  ###  ##   ##
                                                                                     ## ##    ##   #           ##   ##    ##     ##   ##  ##   ##  ##   ##
                                                                                    #####    #######            #####    ####     #####   ##   ##   #####
                                            
                                               Código de entrada: %S
                                                                                     Precio entrada: %.2f€ + IVA 10 = %.2f€ = %.2f€
                                            *****************************************************************************************************************************************************\n\n\n"""
                                    , cont, entradas, pintaAsiento, codigoEntrada, pintaPrecioSinIva, pintaIVA, precioUnidad);


                            if (entradas > 1) {//Muestra mensaje de pulsar enter si se ha comprado más de una entrada
                                System.out.print("Pulsa Enter para ver la siguiente entrada...");
                                sc.nextLine();


                            } else {
                                System.out.print("Pulsa una tecla para continuar...");
                                sc.nextLine();


                            }
                            for (int j = 0; j < 50; j++) {
                                System.out.println();
                            }
                        }
                    }


                    //Imprimimos el ticket de Concierto de Jazz
                    if (jazzTicket) {
                        for (cont = 1; cont <= entradas; cont++) {
                            for (int j = 0; j < 20; j++) {
                                System.out.println();
                            }
                            if (jazzTicket && plateaTicket) {
                                codigoEntrada = "plaJAZZ2011".concat(String.valueOf(140 - plateasJazz_Restantes).concat(String.valueOf(cont)));
                                pintaAsiento = "Platea";
                                if (descuento) {
                                    pintaPrecioSinIva = PRECIOPLATEA_JAZZ - PRECIOPLATEA_JAZZ * DESCUENTO_JAZZ;
                                } else {
                                    pintaPrecioSinIva = PRECIOPLATEA_JAZZ;
                                }
                                pintaIVA = PRECIOPLATEA_JAZZ * IVA;
                                precioUnidad = pintaPrecioSinIva + pintaIVA;
                            }
                            if (jazzTicket && butacaTicket) {
                                codigoEntrada = "butJAZZ2011".concat(String.valueOf(200 - butacasJazz_Restantes).concat(String.valueOf(cont)));
                                pintaAsiento = "Butaca";
                                if (descuento) {
                                    pintaPrecioSinIva = PRECIOBUTACA_JAZZ - PRECIOBUTACA_JAZZ * DESCUENTO_JAZZ;
                                } else {
                                    pintaPrecioSinIva = PRECIOBUTACA_JAZZ;
                                }
                                pintaIVA = PRECIOBUTACA_JAZZ * IVA;
                                precioUnidad = pintaPrecioSinIva + pintaIVA;
                            }
                            if (jazzTicket && anfiteatroTicket) {
                                codigoEntrada = "anfiJAZZ2011".concat(String.valueOf(200 - anfiteatrosJazz_Restantes).concat(String.valueOf(cont)));
                                pintaAsiento = "Anfiteatro";
                                if (descuento) {
                                    pintaPrecioSinIva = PRECIOANFITEATRO_JAZZ - PRECIOANFITEATRO_JAZZ * DESCUENTO_JAZZ;
                                } else {
                                    pintaPrecioSinIva = PRECIOANFITEATRO_JAZZ;
                                }
                                pintaIVA = PRECIOANFITEATRO_JAZZ * IVA;
                                precioUnidad = pintaPrecioSinIva + pintaIVA;
                            }


                            //System.out.println("precioTotal = " + precioTotal);
                            System.out.printf("""
                                            
                                            Esta es tu entrada %d de %d
                                            CONCIERTO DE JAZZ
                                            *********************************************************************************************************************************************************************
                                               Fecha evento: 06-12-2024
                                                                                                                                   _..--""\"""--.._
                                                                                                                                ,-'     ,|.       `-.
                                                                                                                              ,'    _../ | \\--,._    `.
                                                                                                                            ,'   ,;'/\\/  |  !'|\\ `-.   `.
                                                                                                                           /   ,;/|\\' \\,|\\  | > Y\\/`;.   \\
                                                                                                                          / <""  /   ,' | \\ |/,'`.   \\\\ __\\...---""\"
                                                                                                                         |  |   |  ,;'`'   `___...--,/""     /===""\"
                                                                                                                        |   |   |__...---/ /       /'--";   /-""\""
                                                                                                                        |  |   | `|      |'""\"/   /     __...-
                                                                                                                        |  |   | |   /|  >     /   '--"/_..--""
                                                                                                                        | <| __|><.-'-'""|  /   /--"//__..--""
                                                                                                                    __...||"" | |        | /  __..--"" |   |
                                                                                                                    |   | |   | |  |""|_.i'-"" |      /   /
                                                                                                                    |   \\/   | |..-'     _.-""\"|"-._.'   /
                                                                                                                     \\     __;   `-....-'     /  ,-'   ,'
                                                                                                                      `""\""   `.    `-.._____;.-'    ,'
                                                                                                                                `-.               ,-'
                                                                                                                                   `--.._____..--'
                                               Tipo de asiento: %S                                                                                                                    \s
                                            
                                                  ####    #####   ##   ##    ####    ####    #######  ######   ######    #####            #####    #######              ####    ##     #######  #######
                                                 ##  ##  ##   ##  ###  ##   ##  ##    ##      ##   #   ##  ##  # ## #   ##   ##            ## ##    ##   #               ##    ####    #   ##   #   ##
                                                ##       ##   ##  #### ##  ##         ##      ## #     ##  ##    ##     ##   ##            ##  ##   ## #                 ##   ##  ##      ##       ##
                                                ##       ##   ##  ## ####  ##         ##      ####     #####     ##     ##   ##            ##  ##   ####                 ##   ##  ##     ##       ##
                                                ##       ##   ##  ##  ###  ##         ##      ## #     ## ##     ##     ##   ##            ##  ##   ## #             ##  ##   ######    ##       ##
                                                 ##  ##  ##   ##  ##   ##   ##  ##    ##      ##   #   ##  ##    ##     ##   ##            ## ##    ##   #           ##  ##   ##  ##   ##    #  ##    #
                                                  ####    #####   ##   ##    ####    ####    #######  #### ##   ####     #####            #####    #######            ####    ##  ##   #######  #######
                                            
                                            
                                               Código de entrada: %S
                                                                                     Precio entrada: %.2f€ + IVA 10 = %.2f€ = %.2f€
                                            *********************************************************************************************************************************************************************\n\n\n"""
                                    , cont, entradas, pintaAsiento, codigoEntrada, pintaPrecioSinIva, pintaIVA, precioUnidad);


                            if (entradas > 1) {//Muestra mensaje de pulsar enter si se ha comprado más de una entrada
                                System.out.print("Pulsa Enter para ver la siguiente entrada...");
                                sc.nextLine();
                            } else {
                                System.out.print("Pulsa una tecla para continuar...");
                                sc.nextLine();
                            }
                            for (int j = 0; j < 50; j++) {
                                System.out.println();
                            }
                        }


                    }
                    criadasTicket = false;
                    oTOTicket = false;
                    jazzTicket = false;
                    plateaTicket = false;
                    butacaTicket = false;
                    anfiteatroTicket = false;


                    break; //Fin compra de entradas


                case "b": //Consultar el estado de un evento.
                    do {//Bucle de validación
                        System.out.print("""
                                a. Entradas vendidas de cada tipo
                                b. Entradas libres de cada tipo
                                c. Días que quedan hasta el evento y nos informa si estamos en el periodo de descuento por venta anticipada.
                                
                                Elige una opción:\s""");
                        op = sc.nextLine();
                        if (!(op.equals("a") || op.equals("b") || op.equals("c"))) {
                            System.out.println("Introduce una opción válida");
                            System.out.println();
                        }
                    } while (!(op.equals("a") || op.equals("b") || op.equals("c")));


                    switch (op) { //Switch principal Consultar el estado de un evento
                        case "a": //Entradas vendidas de cada tipo
                            do {//Bucle validación opción
                                System.out.print("""
                                        Revisión de entradas vendidas:
                                        
                                        1- Las Criadas
                                        2- II Concierto de Otoño
                                        3- Concierto de Jazz
                                        
                                        Introduce una opción:\s""");


                                op = sc.nextLine();
                                if (!(op.equals("1") || op.equals("2") || op.equals("3"))) {
                                    System.out.println("Introduce una opción válida");
                                    System.out.println();
                                }
                            } while (!(op.equals("1") || op.equals("2") || op.equals("3")));
                            for (int i = 0; i < 40; i++) {
                                System.out.println();
                            }
                            switch (op) { //Switch revisión entradas vendidas
                                case "1": //Revisión entradas vendidas LAS CRIADAS
                                    System.out.printf("Entradas en paleas vendidas en Las Criadas: %d\n\n", 140 - plateasCriadas_Restantes);
                                    System.out.printf("Entradas en butacas vendidas en Las Criadas: %d\n\n", 200 - butacasCriadas_Restantes);
                                    System.out.printf("Entradas en anfiteatros vendidas en Las Criadas: %d\n\n", 200 - anfiteatrosCriadas_Restantes);
                                    System.out.println("Pulsa una tecla para continuar...");
                                    sc.nextLine();
                                    for (int i = 0; i < 50; i++) {
                                        System.out.println();
                                    }
                                    break;
                                case "2"://Revisión entradas vendidas II Concierto de Otoño
                                    System.out.printf("Entradas en plateas vendidas en II Concierto de otoño: %d\n\n", 140 - plateasOTO_Restantes);
                                    System.out.printf("Entradas en butacas vendidas en II Concierto de otoño: %d\n\n", 200 - butacasOTO_Restantes);
                                    System.out.printf("Entradas en anfiteatros vendidas en II Concierto de otoño: %d\n\n", 200 - anfiteatrosOTO_Restantes);
                                    System.out.println("Pulsa una tecla para continuar...");
                                    sc.nextLine();
                                    for (int i = 0; i < 50; i++) {
                                        System.out.println();
                                    }
                                    break;
                                case "3"://Revisión entradas vendidas Concierto de Jazz
                                    System.out.printf("Entradas en plateas vendidas en Concierto de Jazz: %d\n\n", 140 - plateasJazz_Restantes);
                                    System.out.printf("Entradas en butacas vendidas en Concierto de Jazz: %d\n\n", 200 - butacasJazz_Restantes);
                                    System.out.printf("Entradas en anfiteatros vendidas en Concierto de Jazz: %d\n\n", 200 - anfiteatrosJazz_Restantes);
                                    System.out.println("Pulsa una tecla para continuar...");
                                    sc.nextLine();
                                    for (int i = 0; i < 50; i++) {
                                        System.out.println();
                                    }
                                    break;
                            }//Fin switch revisión entradas vendidas
                            break;


                        case "b": //Entradas libres de cada tipo
                            do {//Bucle validación opción
                                System.out.print("""
                                        Revisión de entradas libres:
                                        
                                        1- Las Criadas
                                        2- II Concierto de Otoño
                                        3- Concierto de Jazz
                                        
                                        Introduce una opción:\s""");


                                op = sc.nextLine();
                                if (!(op.equals("1") || op.equals("2") || op.equals("3"))) {
                                    System.out.println("Introduce una opción válida");
                                    System.out.println();
                                }
                            } while (!(op.equals("1") || op.equals("2") || op.equals("3")));


                            for (int i = 0; i < 40; i++) {
                                System.out.println();
                            }
                            switch (op) { //Switch revisión entradas libres
                                case "1": //Revisión entradas libres LAS CRIADAS
                                    System.out.printf("Entradas en paleas libres en Las Criadas: %d\n\n", plateasCriadas_Restantes);
                                    System.out.printf("Entradas en butacas libres en Las Criadas: %d\n\n", butacasCriadas_Restantes);
                                    System.out.printf("Entradas en anfiteatros libres en Las Criadas: %d\n\n", anfiteatrosCriadas_Restantes);
                                    System.out.println("Pulsa una tecla para continuar...");
                                    sc.nextLine();
                                    for (int i = 0; i < 50; i++) {
                                        System.out.println();
                                    }
                                    break;
                                case "2"://Revisión entradas libres II Concierto de Otoño
                                    System.out.printf("Entradas en plateas libres en II Concierto de otoño: %d\n\n", plateasOTO_Restantes);
                                    System.out.printf("Entradas en butacas libres en II Concierto de otoño: %d\n\n", butacasOTO_Restantes);
                                    System.out.printf("Entradas en anfiteatros libres en II Concierto de otoño: %d\n\n", anfiteatrosOTO_Restantes);
                                    System.out.println("Pulsa una tecla para continuar...");
                                    sc.nextLine();
                                    for (int i = 0; i < 50; i++) {
                                        System.out.println();
                                    }
                                    break;
                                case "3"://Revisión entradas libres Concierto de Jazz
                                    System.out.printf("Entradas en plateas libres en Concierto de Jazz: %d\n", plateasJazz_Restantes);
                                    System.out.println();
                                    System.out.printf("Entradas en butacas libres en Concierto de Jazz: %d\n", butacasJazz_Restantes);
                                    System.out.println();
                                    System.out.printf("Entradas en anfiteatros libres en Concierto de Jazz: %d\n", anfiteatrosJazz_Restantes);
                                    System.out.println();
                                    System.out.println("Pulsa una tecla para continuar...");
                                    sc.nextLine();
                                    for (int i = 0; i < 50; i++) {
                                        System.out.println();
                                    }
                                    break;


                            } //Fin switch revisión entradas libres
                            break; //Fin revisión entradas libres
                        case "c": //Revisión días restantes evento y periodo descuento
                            fechaIntroducida = LocalDate.now();


                            entreTiempo = Period.between(fechaIntroducida, fechaCriadas);
                            System.out.println("Quedan " + entreTiempo.getDays() + " días para Las Criadas");
                            if (entreTiempo.getMonths() == 0 && entreTiempo.getYears() == 0 && entreTiempo.getDays() >= 7) {
                                System.out.println("ESTE EVENTO ESTÁ EN PERIODO DE DESCUENTO");
                            } else System.out.println("EL DESCUENTO NO ESTÁ DISPONIBLE PARA ESTE EVENTO");
                            System.out.println();


                            entreTiempo = Period.between(fechaIntroducida, fechaOTO);
                            System.out.println("Quedan " + entreTiempo.getDays() + " días para II Concierto de otoño");
                            if (entreTiempo.getMonths() == 0 && entreTiempo.getYears() == 0 && entreTiempo.getDays() >= 7) {
                                System.out.println("ESTE EVENTO ESTÁ EN PERIODO DE DESCUENTO");
                            } else System.out.println("EL DESCUENTO NO ESTÁ DISPONIBLE PARA ESTE EVENTO");
                            System.out.println();


                            entreTiempo = Period.between(fechaIntroducida, fechaJazz);
                            System.out.println("Quedan " + entreTiempo.getDays() + " días para Concierto de Jazz");
                            if (entreTiempo.getMonths() == 0 && entreTiempo.getYears() == 0 && entreTiempo.getDays() >= 7) {
                                System.out.println("ESTE EVENTO ESTÁ EN PERIODO DE DESCUENTO");
                            } else System.out.println("EL DESCUENTO NO ESTÁ DISPONIBLE PARA ESTE EVENTO");
                            System.out.println();
                            System.out.println("Pulsa una tecla para continuar...");
                            sc.nextLine();
                            for (int i = 0; i < 50; i++) {
                                System.out.println();
                            }


                            break;
                    }
                    break; //Fin consultar estado de un evento


                case "c": //Menú de Administrador
                    System.out.print("Introduce el usuario: ");
                    usuarioIntroducido = sc.nextLine();
                    System.out.print("Introduce la contraseña: ");
                    passIntroducido = sc.nextLine();
                    if (!usuarioIntroducido.equals(USUARIO) || !passIntroducido.equals(PASS)) {
                        System.out.println("Error al introducir los datos");
                        System.out.println();
                        System.out.println("Pulsa una tecla para continuar...");
                        sc.nextLine();
                        for (int i = 0; i < 50; i++) {
                            System.out.println();
                        }
                    } else {
                        for (int i = 0; i < 50; i++) {
                            System.out.println();
                        }
                        //Dentro del Menú administrador
                        System.out.printf("""
                                Bienvenido %s al menú de administrador:
                                
                                i. Consultar los ingresos totales por evento.
                                ii. Consultar las monedas restantes para el cambio.
                                iii. Apagar el software
                                
                                Introduce una opción:\s""", usuarioIntroducido);
                        op = sc.nextLine();


                        switch (op) { //Switch del Menú de Administrador
                            case "i":  //Consultar los ingresos totales por evento.
                                System.out.printf("INGRESOS TOTALES LAS CRIADAS: %.2f€\n", ingresosTotalesCriadas);
                                System.out.printf("INGRESOS TOTALES II Concierto de Otoño: %.2f€\n", ingresosTotalesOTO);
                                System.out.printf("INGRESOS TOTALES Concierto de Jazz: %.2f€\n", ingresosTotalesJazz);
                                System.out.println("Pulsa una tecla para continuar...");
                                sc.nextLine();
                                for (int i = 0; i < 50; i++) {
                                    System.out.println();
                                }
                                break;


                            case "ii":  //Consultar las monedas restantes para el cambio.
                                System.out.println("Cantidad de billetes de 500 disponibles: " + billete500admin);
                                System.out.println("Cantidad de billetes de 200 disponibles: " + billete200admin);
                                System.out.println("Cantidad de billetes de 100 disponibles: " + billete100admin);
                                System.out.println("Cantidad de billetes de 50 disponibles: " + billete50admin);
                                System.out.println("Cantidad de billetes de 20 disponibles: " + billete20admin);
                                System.out.println("Cantidad de billetes de 10 disponibles: " + billete10admin);
                                System.out.println("Cantidad de billetes de 5 disponibles: " + billete5admin);
                                System.out.println("Cantidad de monedas de 2 euros disponibles: " + monedas2euadmin);
                                System.out.println("Cantidad de monedas de 1 euro disponibles: " + monedas1euadmin);
                                System.out.println("Cantidad de monedas de 50 céntimos disponibles: " + monedas50ccadmin);
                                System.out.println("Cantidad de monedas de 20 céntimos disponibles: " + monedas20ccadmin);
                                System.out.println("Cantidad de monedas de 10 céntimos disponibles: " + monedas10ccadmin);
                                System.out.println("Cantidad de monedas de 5 céntimos disponibles: " + monedas5ccadmin);
                                System.out.println("Cantidad de monedas de 2 céntimos disponibles: " + monedas2ccadmin);
                                System.out.println("Cantidad de monedas de 1 céntimos disponibles: " + monedas1ccadmin);


                                System.out.println("Pulsa una tecla para continuar...");
                                sc.nextLine();
                                for (int i = 0; i < 50; i++) {
                                    System.out.println();
                                }
                                break;


                            case "iii": //Apagar el software
                                apagado = true;
                                System.out.print("Apagando");
                                for (int i = 0; i < 3; i++) {
                                    try {
                                        Thread.sleep(600);
                                    } catch (InterruptedException e) {
                                        throw new RuntimeException(e);
                                    }
                                    System.out.print(".");


                                }


                                break;
                            default: //Mensaje de error en el Menú de Administrador
                                System.out.println("Opción no válida");
                                break;
                        }
                    }
                    break;


                default: //Mensaje error switch principal programa
                    System.out.println("Opción no válida");
                    break;
            }
        } while (!apagado);
    }
}

