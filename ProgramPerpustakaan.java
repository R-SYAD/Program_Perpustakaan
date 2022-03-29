package Perpustakaan;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class ProgramPerpustakaan{
    public static void main(String[] args) {
        
        int menu,id_buku,tahun;
        String masukan,nama,pelanggan,ID;
        STACK next;

        Scanner input =new Scanner(System.in);
        Scanner inputNama = new Scanner(System.in);
        Scanner inputID = new Scanner(System.in);
        Scanner Tambah_Buku = new Scanner(System.in);
        Scanner in=new Scanner(System.in);
        Scanner str=new Scanner(System.in); 
        Scanner baru=new Scanner(System.in); 

        LinkedList<String> judul_buku= new LinkedList<>();
        LinkedList<String> Nama_Pelanggan= new LinkedList<>();
        ArrayList<String> ID_Pelanggan= new ArrayList<String>();
        Queue<String> namaBuku= new LinkedList<>();
        Queue<String> pengarangBuku= new LinkedList<>();
        Queue<String> penerbitBuku= new LinkedList<>();

        do {System.out.println("\t==============================");
            System.out.println("\t|PILIH MENU|  ");
            System.out.println("\t________________________________");
            System.out.println("\t1. Cek Buku Yang Tersedia");
            System.out.println("\t2. Tambahkan Buku");
            System.out.println("\t3. Tambahkan Data Pelanggan");

            System.out.print("\tPilihan Anda : ");
            menu=input.nextInt();

            if(menu==1){
                if(judul_buku.isEmpty()){
                    judul_buku.add("Interaksi Manusia Dan Komputer");
                    judul_buku.add("Infrstruktur Teknologi Informasi");
                    judul_buku.add("Pemrograman Bahasa C++");
                    judul_buku.add("Java");
                    judul_buku.add("Java Script");
                    judul_buku.add("Python");
                    judul_buku.add("Teknologi Informasi");
                }
                System.out.println("\t==============================");
                System.out.println("\n\tjudul buku ="+judul_buku);
                System.out.println("\n\tJumlah Buku Tersedia = "+judul_buku.size());
            
            }else if(menu==2){
                int menu1=0;
                String Baru;
                while(menu1!=4){
                    System.out.print("1.push\n2.pop\n3.view\n4.exit\n : ");
                    menu1=in.nextInt();
                    if(menu1==1){
                        Baru=baru.nextLine();
                        judul_buku.push(Baru);
                    }
                    else if(menu1==2) judul_buku.pop();
                    else if(menu1==3) System.out.println(judul_buku);
                    else if(menu1==4) System.out.println("keluar . . .");
                    else System.out.println("salah . . .");
                    System.out.println(" ");
                }    
                    class linked{
                        STACK top;
                        public linked(){
                            top=null;
                        }
                        public void push(STACK a){
                            if(top==null) top=a;
                            else{
                                a.next=top;
                                top=a;
                            }
                        }
                        public void pop(){
                            if(top==null) System.out.println("kosong");
                            else{
                                System.out.println("Popping Data . . .");
                                top.view();
                                top=top.next;
                            }
                        }
                        public void view(){
                            if(top==null) System.out.println("kosong");
                            else{
                                STACK ptr=top;
                                while(ptr!=null){
                                    System.out.println("- - - - -");
                                    ptr.view();
                                    ptr=ptr.next;
                                }
                            }
                        }
                    }
            }else if(menu==3){
                System.out.println("\t==============================");
                System.out.print("\tMasukan Nama Pelanggan         : ");
                pelanggan=inputNama.next();
                Nama_Pelanggan.add(pelanggan);
                System.out.print("\tMasukan Nomor Pelanggan     : ");
                ID = inputID.nextLine();
                ID_Pelanggan.add(ID);
                System.out.print("\tData Pelanggan:"+"\n\t"+"Nama :"+Nama_Pelanggan+"\n\t"+"ID Pelanggan : "+ID_Pelanggan); 
                System.out.print("\n\n");
                

            }else if(menu==4){
            }
                

                
        } while (menu!=5);
    }

}