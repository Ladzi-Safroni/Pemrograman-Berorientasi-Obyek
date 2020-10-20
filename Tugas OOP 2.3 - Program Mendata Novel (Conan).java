package oop.pkg2.program.oop.conan;

import java.util.Scanner

class Novel{
       String title;
       String author;
       int year;
       String synopsis;
       int harga_beli;
       int harga_jual;
   }

public class OOP2ProgramOOPConan {

   
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        Novel novel1 = new Novel();
        novel1.title = "Endless Night - Malam Tanpa Akhir";
        novel1.author = "Agatha Christie";
        novel1.year = 2002;
        novel1.synopsis = "Endless night-Malam tanpa akhir, adalah salah satu novel Agatha Christie yang pernah difilmkan pada tahun 70-an.\n"
                + "               Seperti beberapa judul lainnya, novel ini tidak berkaitan dengan detektif-detektif seperti Poirot, Miss Marple,\n"
                + "               maupun pasangan Beresford yang biasanya bertugas memecahkan suatu kasus. Walaupun dibumbui kisah-kisah roman pada masa itu,\n"
                + "               novel fiksi ini tetap tidak meninggalkan genre misteri seperti halnya karangan Agatha Christie yang lain.";
        novel1.harga_beli = 53000;
        novel1.harga_jual = (novel1.harga_beli - (20 * novel1.harga_beli)/100);
        
        System.out.println("KOLEKSI NOVEL DETEKTIF CONAN");
        System.out.println();
        System.out.println("NOVEL DETEKTIF 1");
        System.out.println("Berjudul     : " +novel1.title);
        System.out.println("Penulis      : " +novel1.author);
        System.out.println("Tahun Terbit : " +novel1.year);
        System.out.println("Sinopsis     : " +novel1.synopsis);
        System.out.println("Harga Beli   : " +novel1.harga_beli);
        System.out.println("Harga Jual   : " +novel1.harga_jual); 
        System.out.println();
        
        Novel novel2 = new Novel();
        novel2.title = "The Body In The Library - Mayat Dalam Perpustakaan";
        novel2.author = "Agatha Christie";
        novel2.year = 2002;
        novel2.synopsis = "Kolonel Bantry membentak, Maksudmu ada mayat di dalam perpustakaan saya—perpustakaan saya?\" Kepala pelayannya berdeham,\n"
                + "               Barangkali Tuan ingin melihatnya sendiri? Bagaimana mayat gadis yang tidak dikenal bisa berada di dalam perpustakaannya?\n"
                + "               Mengapa gadis ini dibunuh? Siapa pembunuhnya?\n "+""+ ""
                + "              Ruby Keene datang ke Danemouth untuk bekerja sebagai penari di Hotel Majestic dengan penuh harapan akan masa depan yang lebih baik.\n"
                + "               Namun harapannya terpotong pendek—demikian pun hidupnya.\n "
                + "              Miss Marple tepekur memandang mayat gadis belia yang terkapar tak bernyawa di kakinya.\n"
                + "               Sayang—begitulah perasaan yang timbul di hati perempuan tua yang baik ini.\n"
                + "               Sayang, suatu kehidupan yang sebetulnya mempunyai masa depan yang lebih panjang kini terbunuh sia-sia.\n "
                + "              Apakah Ruby Keene ini gadis tak berdosa yang dibunuh oleh manusia-manusia kejam ataukah memang dia sendiri yang mengundang kematiannya?\n"
                + "               Pada hari yang sama polisi menemukan korban pembunuhan kedua—juga seorang gadis remaja.\n"
                + "               Miss Marple meramalkan pasti bakal ada usaha pembunuhan ketiga!";
        novel2.harga_beli = 180000;
        novel2.harga_jual = (novel2.harga_beli - (20 * novel2.harga_beli)/100);
        
        
        System.out.println("NOVEL DETEKTIF 2");
        System.out.println("Berjudul     : " +novel2.title);
        System.out.println("Penulis      : " +novel2.author);
        System.out.println("Tahun Terbit : " +novel2.year);
        System.out.println("Deskripsi    : " +novel2.synopsis);
        System.out.println("Harga Beli   : " +novel2.harga_beli);
        System.out.println("Harga Jual   : " +novel2.harga_jual); 
        System.out.println();
        
        Novel novel3 = new Novel();
        novel3.title = "Hercule Poirot's Christmas - Pembunuhan Di Malam Natal";
        novel3.author = "Agatha Christie";
        novel3.year = 2013;
        novel3.synopsis = "Si tua Simeon Lee mengundang seluruh keluarganya untuk bersama-sama merayakan Natal di Gorston Hall.\n "
                + "              Dia menciptakan hiburan bagi diri sendiri dengan mempermainkan nafsu serakah mereka, dia mengundang seluruh keluarganya,\n "
                + "              tak terkecuali anak laki-lakinya yang telah lama pergi dari rumah dan juga dua anak laki-laki lainnya.\n"
                + "               Dia juga ingin memberikan kejutan dengan mendatangkan cucunya, anak dari anak perempuannya yang sudah lama meninggal, yang sedang tinggal di Spanyol.\n"
                + "               Simeon Lee juga kedatangan tamu yang mengaku sebagai anak dari sahabat lamanya di Afrika Selatan.\n"
                + "               Tapi, di tengah suasana Natal, terjadi hal yang sangat tidak terduga.\n"
                + "               Simeon Lee terbunuh! dia dibunuh dengan sangat kejam yang meninggalkan begitu banyak darah di kamarnya.\n"
                + "               Inspektur polisi yang kebetulan berada disana pun langsung sigap mencari petunjuk untuk mengungkap pembunuhan ini.\n"
                + "               Berita pembunuhan ini secara cepat menyebar, dan sampai di telinga Hercule Poirot yang sedang berada di rumah kepala polisi.\n"
                + "               Mendengar berita ini, Hercule Poirot dan Kepala polisi langsung menuju ke tempat kejadian. Setelah menyelidiki selama beberapa malam,\n"
                + "               akhirnya Hecule Poirot membuat kesimpulan yang sangat tidak terduga! benar-benar tidak terduga!";
        novel3.harga_beli = 50000;
        novel3.harga_jual = (novel3.harga_beli - (20 * novel3.harga_beli)/100);
        
        
        System.out.println("NOVEL DETEKTIF 3");
        System.out.println("Berjudul     : " +novel3.title);
        System.out.println("Penulis      : " +novel3.author);
        System.out.println("Tahun Terbit : " +novel3.year);
        System.out.println("Deskripsi    : " +novel3.synopsis);
        System.out.println("Harga Beli   : " +novel3.harga_beli);
        System.out.println("Harga Jual   : " +novel3.harga_jual); 
        System.out.println();
        
        Novel novel4 = new Novel();
        novel4.title = "The Dead Returns : Ketika Hidup Lebih Berharga Dari Kematian";
        novel4.author = "Akiyoshi Rikako";
        novel4.year = 2016;
        novel4.synopsis = "Suatu malam, aku didorong jatuh dari tebing. Untungnya aku selamat. Namun, saat aku membuka mataku dan menatap cermin,\n"
                + "               aku tidak lagi memandang diriku yang biasa-biasa saja.\n"
                + "               Tubuhku berganti dengan sosok pemuda tampan yang tadinya hendak menolongku.\n"
                + "               Dengan tubuh baruku, aku bertekad mencari pembunuhku. Tersangkanya, teman sekelas. Total, 35 orang.\n"
                + "               Salah satunya adalah pembunuhku";
        novel4.harga_beli = 80000;
        novel4.harga_jual = (novel4.harga_beli - (20 * novel4.harga_beli)/100);
        
        
        System.out.println("NOVEL DETEKTIF 4");
        System.out.println("Berjudul     : " +novel4.title);
        System.out.println("Penulis      : " +novel4.author);
        System.out.println("Tahun Terbit : " +novel4.year);
        System.out.println("Deskripsi    : " +novel4.synopsis);
        System.out.println("Harga Beli   : " +novel4.harga_beli);
        System.out.println("Harga Jual   : " +novel4.harga_jual); 
        System.out.println();
        
        Novel novel5 = new Novel();
        novel5.title = "The Woman In White";
        novel5.author = "Wilkie Collins";
        novel5.year = 1860;
        novel5.synopsis = "Awalnya dibuat berseri pada tahun 1859 hingga 1860 kemudian diterbitkan dalam bentuk buku pada tahun 1860,\n"
                + "               novel epistolary ini dianggap sebagai salah satu novel misteri pertama.\n"
                + "               Walter Hartright adalah seorang seniman yang dipekerjakan untuk menjadi master menggambar,\n"
                + "               untuk dua saudara tiri Laura Fairlie dan Marian Halcombe. Dia dan Laura segera jatuh cinta,\n"
                + "               tetapi mereka tidak bisa bersama karena perbedaan kelas\n"
                + "               dan janji Laura sebelumnya kepada ayahnya yang sekarang sudah meninggal untuk menikahi Lord Percival Glyde.\n"
                + "               Seorang wanita misterius berpakaian serba putih memperingatkan Laura terhadap pernikahannya, menyebut Lord Glyde jahat.\n"
                + "               Namun, Laura enggan mengingkari janji terakhirnya kepada ayahnya dan melanjutkan pernikahannya,\n"
                + "               mengirim dirinya, Marian, dan Walter ke dalam spiral intrik dan bahaya.";
        novel5.harga_beli = 200000;
        novel5.harga_jual = (novel5.harga_beli - (20 * novel5.harga_beli)/100);
        
        
        System.out.println("NOVEL DETEKTIF 5");
        System.out.println("Berjudul     : " +novel5.title);
        System.out.println("Penulis      : " +novel5.author);
        System.out.println("Tahun Terbit : " +novel5.year);
        System.out.println("Deskripsi    : " +novel5.synopsis);
        System.out.println("Harga Beli   : " +novel5.harga_beli);
        System.out.println("Harga Jual   : " +novel5.harga_jual); 
        System.out.println();
    }
}
