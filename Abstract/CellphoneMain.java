package Abstract;

public class CellphoneMain 
{
    public static void main(String[] args) 
    {
        Cellphone cp = new Cellphone("Nokia", "3310");
        cp.powerOn();

        cp.volumeUp();
        cp.volumeUp();
        System.out.println("Volume Saat ini = " + cp.getVolume());

        cp.topUpCredit(10000);
        System.out.println("Sisa Pulsa      = " + cp.getRemainingCredit());

        cp.addContact("Ananda Hadyan Hanif" ,  "082310869696");
        cp.addContact("Budi" , "082386978563");

        System.out.println("Daftar kontak =");
        for (Contact contact : cp.getAllContacts()) 
        {
            System.out.println(contact.getNama() + "= " + contact.getNomor());
        }

        String searchName = "Ananda Hadyan Hanif";
        Contact foundContact = cp.searchContact(searchName);
        if (foundContact != null) {
            System.out.println("Kontak ditemukan:");
            System.out.println("Nama  = " + foundContact.getNama());
            System.out.println("Nomor = " + foundContact.getNomor());
        } else {
            System.out.println("Kontak dengan nama " + searchName + " tidak ditemukan");
        }
    }
}
