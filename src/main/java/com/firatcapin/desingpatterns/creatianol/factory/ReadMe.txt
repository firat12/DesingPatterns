Bir örnekle anlatacka olursak
Bir telefon Fabrikası düşünelim.
Bu fabrikada telefon modelleri üretiliyor. Her üretim aşamasında her model için new diyerek telefon modeli oluşturulduğunu düşünelim
Bu için new diyerek bayilerin değilde toplu şekilde fabrika da modeline göre üretilmesini yani nesne oluşmasını istiyoruz.
Bayiler fabrikadan telefon istiyorlar bunun için bir TelefonBayi clasınıı oluşturduk.

Telefon modeline göre üretilmesini telefonfabrika clasına bırakmış olduk.

Ama burda şöyle bir durum var. Her modele göre gidip telefon fabrika clasında her model için bir if else yapmak lazım.
Bu kalıbın dezavantajı binlerce model için ortaya büyük bir karmaşıklığa sebebiyet veriyoruz.
Bunu çözmek için Abstract Factory Desing Pattern yöntemi ortaya çıkmış.
