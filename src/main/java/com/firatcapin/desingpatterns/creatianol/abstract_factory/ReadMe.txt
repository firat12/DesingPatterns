Factroy Pattern da yaşadığımız sorunu bu desing pattern ile çözüyoruz.
Bayileri , Her model için kendi fabrikalarından istediğini düşünelim.
Örneğin s8 için s8 fabrikasından
note8 için note8 fabrikasından telefon istenilsin.
Yani verilen türe göre bir Telefon Nesnesi dönmesi.Bunun için TelefonFactory interface oluşturuyoruz.
Bu interface de kendi içinde Telefon nesnesini döndürüyor.
Sonrasında bu classı implement edecek olan S8 ve Note8 fabrikası oluşturuyoruz.