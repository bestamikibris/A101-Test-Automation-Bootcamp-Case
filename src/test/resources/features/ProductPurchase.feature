Feature:

  @Chrome
  Scenario: Ürün sipariş etme
    Given Giyim--> Aksesuar--> Kadın İç Giyim-->Dizaltı Çorap bölümüne girilir.
    And Bir ürüne tıklanır
    Then Açılan ürünün siyah olduğu doğrulanır.
    And Sepete ekle butonuna tıklanır.
    And Sepeti Görüntüle butonuna tıklanır.
    And Sepeti Onayla butonuna tıklanır.
    And Üye olmadan devam et butonuna tıklanır.
    And Mail girilir
    And Devam et butonuna tıklanır.
    Then Adres ekranı geldiği kontrol edilir.
    And Yeni adres ekle butonuna tıklanır.
    And Adres bilgileri girilir.
    And Kaydet butonuna tıklanır.
    And Kargo firması seçilir.
    When Kaydet ve Devam Et butonuna tıkla
    Then Ödeme ekranının geldiği görülür.







