
import java.io.IOException;
import java.util.Scanner;


import java.awt.Desktop;
import java.net.URI;

public class main_auxilio{


    public static void main(String[] args) throws IOException, InterruptedException {
        // TODO Auto-generated method stub


        Scanner leia = new Scanner(System.in);


        String opS2;
        String opS;
        String ops3;
        String ops4;
        String ops5;
        String ops6;


        do {




            menu();


            opS = leia.nextLine();

            /* if (System.getProperty("os.name").contains("Windows"))*/
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				            /*else
				            Runtime.getRuntime().exec("clear");*/


            if (opS.matches("^[0-6]+$")) {


            }else {
                System.out.println("ENTRADA INVÁLIDA, DIGITE ALGUMAS DAS OPÇÕES ACIMA: ");
                continue;
            }

            switch(opS) {

                case "1":
                    try {
                        Desktop.getDesktop().browse(new URI("https://paineis-gac.almg.uucp/app/kibana#/dashboard/d6447b70-f99f-11ea-a82b-774d1f540302?_a=(description:'Painel%20de%20chamados%20em%20aberto%20na%20fila.%20%0ASubstituindo%20o%20painel%20do%20sgar:%20https:%2F%2Fsgar%2Fpages%2Fssi-gac.php',filters:!(('$state':(store:appState),meta:(alias:'Estagi%C3%A1rios%20da%20GAC',disabled:!f,index:d89edb80-ec80-11ea-9ac3-bde2acac8b80,key:Tecnico.keyword,negate:!f,params:!('LUIZ%20HENRIQUE%20M.%20V.%20CASTRO','PABLO%20LUCAS%20SANTANA%20QUEIROZ','JO%C3%83O%20VICTOR%20ALMEIDA%20ARANTES','VICTOR%20EDUARDO%20DE%20SOUZA','LEONARDO%20SAID%20BARBOSA','MATHEUS%20DE%20ALMEIDA%20BARROSO','ANNA%20CLAUDIA%20DE%20P%C3%81DUA'),type:phrases,value:'LUIZ%20HENRIQUE%20M.%20V.%20CASTRO,%20PABLO%20LUCAS%20SANTANA%20QUEIROZ,%20JO%C3%83O%20VICTOR%20ALMEIDA%20ARANTES,%20VICTOR%20EDUARDO%20DE%20SOUZA,%20LEONARDO%20SAID%20BARBOSA,%20MATHEUS%20DE%20ALMEIDA%20BARROSO,%20ANNA%20CLAUDIA%20DE%20P%C3%81DUA'),query:(bool:(minimum_should_match:1,should:!((match_phrase:(Tecnico.keyword:'LUIZ%20HENRIQUE%20M.%20V.%20CASTRO')),(match_phrase:(Tecnico.keyword:'PABLO%20LUCAS%20SANTANA%20QUEIROZ')),(match_phrase:(Tecnico.keyword:'JO%C3%83O%20VICTOR%20ALMEIDA%20ARANTES')),(match_phrase:(Tecnico.keyword:'VICTOR%20EDUARDO%20DE%20SOUZA')),(match_phrase:(Tecnico.keyword:'LEONARDO%20SAID%20BARBOSA')),(match_phrase:(Tecnico.keyword:'MATHEUS%20DE%20ALMEIDA%20BARROSO')),(match_phrase:(Tecnico.keyword:'ANNA%20CLAUDIA%20DE%20P%C3%81DUA'))))))),fullScreenMode:!t,options:(hidePanelTitles:!f,useMargins:!t),panels:!((embeddableConfig:(title:''),gridData:(h:8,i:e0e7a849-35bb-4856-91dc-6ba765c8b10a,w:5,x:0,y:0),id:abbb6380-eed9-11ea-9ac3-bde2acac8b80,panelIndex:e0e7a849-35bb-4856-91dc-6ba765c8b10a,type:visualization,version:'7.7.1'),(embeddableConfig:(title:''),gridData:(h:8,i:f0e86193-575a-48a9-83c1-a27d384acebc,w:12,x:5,y:0),id:'5f214180-f9a0-11ea-a82b-774d1f540302',panelIndex:f0e86193-575a-48a9-83c1-a27d384acebc,type:visualization,version:'7.7.1'),(embeddableConfig:(),gridData:(h:8,i:bde4ce05-a7bd-473c-985c-6c1158e2bc5a,w:12,x:17,y:0),id:d15a7110-f9df-11ea-a82b-774d1f540302,panelIndex:bde4ce05-a7bd-473c-985c-6c1158e2bc5a,type:visualization,version:'7.7.1'),(embeddableConfig:(),gridData:(h:8,i:'6dd0be34-768d-47fe-abf5-5e21479ee30a',w:11,x:29,y:0),id:bb2eaae0-e91b-11ed-a323-a51ef13e8d46,panelIndex:'6dd0be34-768d-47fe-abf5-5e21479ee30a',type:visualization,version:'7.7.1'),(embeddableConfig:(title:''),gridData:(h:8,i:b81b1315-9125-42e6-b257-3de2441d3553,w:8,x:40,y:0),id:'22268770-f9a2-11ea-a82b-774d1f540302',panelIndex:b81b1315-9125-42e6-b257-3de2441d3553,type:visualization,version:'7.7.1'),(embeddableConfig:(title:''),gridData:(h:39,i:'63a84578-1688-4306-a648-5c6f17e496bd',w:48,x:0,y:8),id:'0e27d830-f99f-11ea-a82b-774d1f540302',panelIndex:'63a84578-1688-4306-a648-5c6f17e496bd',type:search,version:'7.7.1')),query:(language:kuery,query:''),savedQuery:'Estagi%C3%A1rios%20da%20GAC',timeRestore:!t,title:'%5BSSI%5D%20-%20Solicita%C3%A7%C3%B5es%20em%20aberto',viewMode:view)&_g=(filters:!(),refreshInterval:(pause:!f,value:15000),time:(from:'2013-12-31T03:00:00.000Z',to:now))"));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    System.out.println("SITE ABERTO NO NAVEGADOR!\n");
                    System.out.println("PRESSIONE ENTER PARA CONTINUAR!\n");
                    break;
                case "2":
                    try {
                        Desktop.getDesktop().browse(new URI("https://alfresco.almg.gov.br/share/page/repository#filter=path%7C%2FSites%2Fgti-roteiros-tecnicos%2FdocumentLibrary%2FOperacional%2FRoteiros%2520T%25E9cnicos%2520-%2520GAC%7C&page=1"));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("SITE ABERTO NO NAVEGADOR!\n");
                    System.out.println("PRESSIONE ENTER PARA CONTINUAR!\n");
                    break;
                case "3":
                    try {
                        Desktop.getDesktop().browse(new URI("https://wiki.almg.gov.br/index.php/FAQ_da_GAC"));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("SITE ABERTO NO NAVEGADOR!\n");
                    System.out.println("PRESSIONE ENTER PARA CONTINUAR!\n");
                    break;
                case "4":
                    try {
                        Desktop.getDesktop().browse(new URI("https://intra.almg.gov.br/servicos/tecnologia-da-informacao/orientacoes-de-ti/seguranca-da-informacao-e-uso-da-rede/orientacoes-gerais-para-uso-dos-recursos/"));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("SITE ABERTO NO NAVEGADOR!\n");
                    System.out.println("PRESSIONE ENTER PARA CONTINUAR!\n");
                    break;

                case "5":
                    try {
                        Desktop.getDesktop().browse(new URI("https://sgar/pages/inicial.php"));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("SITE ABERTO NO NAVEGADOR!\n");
                    System.out.println("PRESSIONE ENTER PARA CONTINUAR!\n");
                    break;

                case "6":
                    do {


                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("\n=====================\n"
                                + "       RAMAIS\n"
                                + "=====================");

                        System.out.println("\n1)-GAC\n"
                                + "2)-GTEC\n"
                                + "3)-GGA (CENTRAL)\n"
                                + "4)-GGOV\n"
                                + "5)-GITI\n"
                                + "0)-Voltar\n"
                                + "DIGITE SUA OPÇÃO: ");




                        opS2 = leia.nextLine();


                        if (opS2.matches("^[0-5]+$")) {


                        }else {
                            System.out.println("\nENTRADA INVÁLIDA, DIGITE ALGUMAS DAS OPÇÕES ACIMA: ");
                            continue;
                        }







                        if(opS2.equalsIgnoreCase("0")) {
                            break;

                        }
                        if(opS2.equalsIgnoreCase("1")) {
                            do {


                                System.out.print("\033[H\033[2J");

                                System.out.println("\n=====================\n"
                                        + "       GAC\n"
                                        + "=====================");
                                System.out.println("\nESTAGIARIOS - 7013\n"
                                        + "JULIANA - 7007\n"
                                        + "CLAUDER - 7006\n"
                                        + "AMARILDO && RAFAEL - 7012\n"
                                        + "SAUER && RONALDO - 7008\n"
                                        + "MANUEL && DELBONI- 7011\n"
                                        + "DIGITE (0) PARA VOLTAR: ");
                                ops3 = leia.nextLine();

                                if(ops3.matches("^[0]+$")) {

                                    continue;
                                }else {
                                    System.out.println("\nOPÇÃO INVALIDA!, DIGITE NOVAMENTE: ");
                                    System.out.flush();
                                    continue;
                                }


                            }while(!ops3.equals("0"));

                        }

                        else if(opS2.equalsIgnoreCase("2")) {
                            do {
                                System.out.print("\033[H\033[2J");
                                System.out.flush();
                                System.out.println("\n=====================\n"
                                        + "       GTEC\n"
                                        + "=====================");
                                System.out.println("\nBRENO - 7060\n"
                                        + "CRISTIANO - 7003\n"
                                        + "DANIEL ANDRADE && BERNARDO - 7004\n"
                                        + "MAURÍCIO LIMA- 7002\n"
                                        + "DIGITE (0) PARA VOLTAR: ");
                                ops4 = leia.nextLine();

                                if(ops4.matches("^[0]+$")) {

                                }else {
                                    System.out.println("\nOPÇÃO INVALIDA!, DIGITE NOVAMENTE: ");
                                    continue;
                                }


                            }while(!ops4.matches("^[0]+$"));

                        }


                        else if(opS2.equalsIgnoreCase("3")) {
                            do {
                                System.out.print("\033[H\033[2J");
                                System.out.flush();
                                System.out.println("\n=====================\n"
                                        + "    GGA - CENTRAL\n"
                                        + "=====================");
                                System.out.println("\nLUIZ ANTÔNIO - 7009\n"
                                        + "CRISTINA - 7704\n"
                                        + "FÁBIO AUGUSTO - 7027\n"
                                        + "SILVANA - 7273\n"
                                        + "RECEPÇÃO GTI - 7700\n"
                                        + "CENTRAL GTI - 7710\n"
                                        + "DIGITE (0) PARA VOLTAR: ");
                                ops5 = leia.nextLine();

                                if(ops5.matches("^[0]+$")) {

                                }else {
                                    System.out.println("\nOPÇÃO INVALIDA!, DIGITE NOVAMENTE: ");
                                    continue;
                                }


                            }while(!ops5.matches("^[0]+$"));
                        }


                        else if(opS2.equalsIgnoreCase("4")) {

                            do {
                                System.out.print("\033[H\033[2J");
                                System.out.flush();
                                System.out.println("\n=====================\n"
                                        + "       GGOV \n"
                                        + "=====================");
                                System.out.println("\nRAMAL INDISPONIVEL! "
                                        + "DIGITE (0) PARA VOLTAR: ");
                                ops5 = leia.nextLine();

                                if(ops5.matches("^[0]+$")) {

                                }else {
                                    System.out.println("\nOPÇÃO INVALIDA!, DIGITE NOVAMENTE: ");
                                    continue;
                                }


                            }while(!ops5.matches("^[0]+$"));


                            System.out.println("\n\\n ");
                        }


                        else if(opS2.equalsIgnoreCase("5")) {

                            do {
                                System.out.print("\033[H\033[2J");
                                System.out.flush();
                                System.out.println("\n=====================\n"
                                        + "       GITI\n"
                                        + "=====================");
                                System.out.println("\nEDUARDO - 7711\n"
                                        + "RONAN - 7712\n"
                                        + "VINÍCIUS && SERGIO GOMES && MURILO  - 7706\n"
                                        + "ESTAGIARIOS - 7709 \n"
                                        + "DIGITE (0) PARA VOLTAR: ");
                                ops6 = leia.nextLine();

                                if(ops6.matches("^[0]+$")) {

                                }else {
                                    System.out.println("\nOPÇÃO INVALIDA!, DIGITE NOVAMENTE: ");
                                    continue;
                                }


                            }while(!ops6.matches("^[0]+$"));
                        }






                    }while(!opS2.equalsIgnoreCase("5") || !opS2.equalsIgnoreCase("4") || !opS2.equalsIgnoreCase("3") || !opS2.equalsIgnoreCase("2") || !opS2.equalsIgnoreCase("1") || !opS2.equalsIgnoreCase("0"));





            }




        }while(!opS.equals("0"));




        System.out.println("PROGRAMA FINALIZADO!");

        leia.close();
        System.exit(0);




    }


    static void menu() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\n=========================================\n"
                + " BEM VINDO AO MENU DOS ESTAGIÁRIOS DA GAC\n"
                + "=========================================\n");



        System.out.println("1)- ABRIR A FILA DOS ESTAGIARIOS DA GAC\n"
                + "2)- ROTEIROS TECNICOS DA GAC\n"
                + "3)- ABRIR O FAQ DA GAC\n"
                + "4)- ORIENTAÇÕES DE TI (INTRANET)\n"
                + "5)- SGAR\n"
                + "6)- RAMAL\n"
                + "0)- SAIR\n"
                + "DIGITE SUA OPÇÃO: ");


    }
}


