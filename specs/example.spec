Getting Started with Gauge
==========================

This is an executable specification file. This file follows markdown syntax. Every heading in this file denotes a scenario. Every bulleted point denotes a step.
To execute this specification, use `mvn test`




Get Started
-----------
* Search "İstanbul"
* Open House Tab
* Click Save Search
* Click Turn off cookies
* Click on rent

* Click apartment
* Select "istanbul (anadolu)" in city Dropdown
* Select "pendik" in district Dropdown



 "İstanbul" yaziyi "//*[@id='searchText']" alanına yaz
 "//*[@value='Ara']" e tıkla
 "//*[@data-category='3518' and c6ontains(text(),'Konut')]" e tıkla
 "//*[@id='onetrust-accept-btn-handler']" e tıkla
 "//*[text()='Aramayı Kaydet']" e tıkla
 "//*[@title='Kiralık']" e tıkla
 "//*[@title='Daire' and @href='/kiralik-daire/istanbul?query_text_mf=%C4%B0stanbul']" e tıkla
 "//*[@class='faceted-select' and contains(text(),'İstanbul')]" e tıkla
 "//*[@class='noChild single-selection' and contains(text(),'Anadolu')]" e tıkla
 "//*[@class='faceted-select' and contains(text(),'İlçe')]" e tıkla
 "//*[@class='js-address-filter' and @placeholder='İlçe']" e tıkla yazı yaz
 "//*[@class='noChild facetedCheckbox' and text()='Kadıköy']" e tıkla
 "//*[@class='collapse-pane']" e tıkla
 "//*[@class='faceted-select' and @title='Mahalle']" e tıkla
 "//*[@class=' facetedCheckbox' and text()='Acıbadem ']" e tıkla
 "//*[@class=' facetedCheckbox' and contains(text(),'Çifte')]" e tıkla
 "//*[@placeholder='Semt / Mahalle']" e tıkla mahalle adı yaz
 "//*[@data-label='erenkoy']//*[@class=' facetedCheckbox']" e tıkla
 "//*[@data-address='quarter']//*[contains(@class,'collapse-pane')]" e tıkla2
 "//*[@name='price_min']" e tikla baslangic tutarini "//*[@placeholder='max TL']" e tikla bitis tutarini yaz
 "//*[@title='2+1']" e tıkla
 "//*[@title='3+1']" e tıkla
 "//*[@id='_cllpsID_a812']" e tıkla
 "//*[@tabindex='49']" e tıkla
 "//*[@tabindex='50']" e tıkla
 "//*[@tabindex='44']" e tıkla
 "//*[@title='Doğalgaz (Kombi)']" e tıkla
 "//*[@title='Merkezi']" e tıkla
 "//*[@title='Var']" e tıkla
 "//*[@title='Emlak Ofisinden']" e tıkla
 "//*[@class='btn btn-block search-submit']" e tıkla
 "//*[@title='Fiyat']" e tıkla


