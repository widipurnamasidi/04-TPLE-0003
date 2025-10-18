thank cuy
Sambil cek aja modul nya

//nama file Orang.java
package inheritance;
class Orang {
public String nama;
public changeNama(String newNama){
this.nama = newNama;
}
}

//Buka Kembali class Orang.java pada package inheritance, ganti atribut nama dari public
menjadi protected

package inheritance;
public class Orang {
protected String nama;
public void setNama(String nama){
this.nama=nama;
}
public String getNama(){
return this.nama;
}
}

//nama file ContohPublic.java
package java2;
import inheritance.Orang;
public class ContohPublic {
}

//nama file ContohPrivate.java
package inheritance;
class ContohPrivate {
public static void main(String[] args){
Orang xOrang = new Orang();
xOrang.nama = "Galuh Saputri"; //disini error
}
}

//nama file ContohProtected.java
package java2;
import inheritance.Orang;
public class ContohProtected {
Orang xOrang = new Orang();
public ContohProtected() {
/_ error karena atribut nama
diberikan modifier protected _/
xOrang.nama = "Galuh Saputri";
}
}
