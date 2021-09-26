# README

## 任务0：example的可视化

<a href="https://asciinema.org/a/436647" target="_blank"><img src="https://asciinema.org/a/436647.svg" /></a>



## 任务1：

### 类图和时序图



![img](http://www.plantuml.com/plantuml/png/VPAz3jCm4CVtUuhR-91AHwGCg7Jfme0ei2069p5fX6D7_X2K28bAHM91Oc3g2_00B4Yy3bNx6DZnsGgDn9BSdV_tyvtlLiOoRLqduCxEsjuKosKlc0oH1vNgbfLWnYpgbZMQTG2ZYsjNbe9lbRPSKsZ3-OViF6ab9_EfCgrjbOHMUl4RLl5modpw948aY114jLWW1Gky7axdRr_m4SG0tlU7qm8AKbvEnp-_Fbr-V2qInsFIPGMUF_-y7hxZGm-YM22DfHP9bH4GmY4_rr_WvVSnrh5HJjTJ-3pVgu1Brs7K3g5NrEEt6Ryb933sP00qt8xwzVuPas_ltWCTVrPjhMvbuqt3RKhqtaUOF3WEcVdgTQOQWDvPh_NmVr5MFTQQxQUONDEGtqZGiCBD58iPitdYS5DTS-kzPCBDiccg0mZ5wj2XzobPC6foldNnINsV36936BOM4gJCqa1yn_h_WcbT1Y33xdYqqiePsa-V-poTnM54WRVzE_4NuPgUQSFf1lwULyx6bbTSrguJVm40)

![img](http://www.plantuml.com/plantuml/png/FCYX3W8n30PWtwUOGntp288xW-C9olRdMDAjHziPdfv02FBxBXviCRiG7HuHkvzoteN7fuv5UtOy9qR1KXjlnfs8IwYb5NZ1VhYfnH_NDa2LW-_iIAjEgrHK12MQ3a-Y6n5zFotdzy3AhPvDsVTaH_EJ7QjUJ5pzeclPqpahNiwO_xHZ-ils7YukY5KWjH2MbSBJ_jKl6XgVTsm7egVjkvxDNOfG17OCI15SnSk6pcVTAv_rJNgwg__vh9PdqtO-spmLgW7k0eLdFPrFTlSzNRByQSU6fnlwGSgNxWMwulsUHeHQaEE1rczeWqi33NooV-6pnlL0Bm1r0kMVx5ZBvP2Qbm8CGG00)



### example的设计理念

1. 首先`Geezer`中的私有构造方法和`public static getTheGeezer()`方法实际上是确保`Geezer`对象的唯一性，从现实世界来看就是只有一位老爷爷。
2. 用枚举`Gourd`来代表葫芦，`Gourd`实现了`Linable`接口，赋予了其可排序的（或者说可队列化）的性质。
3. `Line`的内部类`Posistion`代表了两者的**聚合**关系，即`Line`是有自己的`Position`，但`Position`并不只能被`Line`所拥有。
4. 用`Sorter`和`Linable`两个`interface`来抽象出排序和可队列化的共性条件，使代码具有**良好的可扩展性和可修改性**。在实现具体的排序方法时，只需要`class BubbleSort implements Sorter`即可。
5. `Geezer`持有`Sorter`的引用，两者是聚合的关系，但`Geezer`并不在乎具体是哪种`Sorter`，这就是按接口编程的好处，只需要知道接口的用处而不用在乎接口的具体实现。为代码的**可修改性**、**可拓展性**打下了良好的基础



### example的可改进之处

1. **成员变量**和**成员方法**可以分离。
2. 枚举类`Gourd`不适合扩展，像作业要扩展成256个的话就不适合用枚举类了。
3. `Color`可以单独出来创建一个对象，然后与`Gourd`组合起来。



## 任务2：

[![asciicast](https://asciinema.org/a/438146.svg)](https://asciinema.org/a/438146)

类图

![img](http://www.plantuml.com/plantuml/png/VLBDYjH04BxNK_JD7nZddXsMTJmimWgoKI_YePDfCs4xtQ6xum-3uC8ANWGFuc71imyWWY3uDBlCF8RLgKhiu3ANr4_LztrLdJhoGRhGDHfkhKDeVJQVjrgQcBbNscPUQkdzR5NBoia6e0_5iYiAhNBhWdASoeqyK-oVr6Pm7rjVXzeQg0tslfIbYbM9w2Gp8NfaZVyNFR3QkfjKeHSKmivcWWaoiJk_lFxyKHm29SHTBAQeZ3ktbnTNlzvllt_Ac6Q1ZN7gJ5n_-B4x_u8K65AUviNIrPzlkvzViSGZHkrnmMpx-mAr6JWj2Qgbo9INdN6eQHyzGS8nVIUnWRv1bF4BWwPeauSNJfepW4g5KtHktudUq4ZHCwaxXMwmUN2rgT3ravvtaFnRr1nApr-CIXwWxGBnfLJHlU-SV9lI37YaulM59WjHcNE4-Ezqn2QTRjy-Z4xF3C7QobNS46C6QybBJY-D-v42zvH02uaMks4WASRMoFXQjdk9wTesG3QiLUy0Ata-RGG-uHBz2AgZZs-adaQ9LZglc5szKMKNLAf39x6Xdt_GcufCSG2v2ekJseV5GnDKfToXS5K1KUVqU8aiQ_bAvR9H5CMh8NDCPjaB7IcpwXhz5m00)



## 任务3：

[![asciicast](https://asciinema.org/a/438145.svg)](https://asciinema.org/a/438145)

类图

![img](http://www.plantuml.com/plantuml/png/VLFDYjH04BxtKzJD7nZddXsMTJmimYx8Hhs8XqgcpOJjT8VkZgu4mOKLl0WUnCE2Pnz0147mQNQPUGmhgSgOuBAdhf-llg-gKZa84NriAgFkh6EiGpAVrmPj5tcGksgU6mnXjYgny5WfrRkmRBBCwDJvgBs4KekdMknZZBuy4-U92sKidLMb9VGhp3KSbHQfVXIPK1qx6_vvZvnn_YPTrKi2kDaCX221xVdbzUUFiAyu0FSfEQvA1BcvlBZwzNxp_LCYD0i2Sjy9N7_uiJt_GYGSw7FISm9NVxvjVtwbfBJPwmz39flV5wmlfPCaI7PKEsOMOzVQ5CUB675CjmMjwW6Gz_iQDA4UhHyysbEb2XrFoBXxhxC687lFqJIQpEXIQjyMP8O9vfsQV6DeTqelNkwqWb9r4vbnIXRTG-_nxPXeg2SgMG0OVbMdBJ6k-E-4e1ttTzj4asevZbOPXwjkHlAbsA2CERqumHC5pOcA1uAQq6eWoNRGZl4DrhSIyzMrYj-urhsXH2d8YLFXKqdnf-0ysRGZ_QoJgD47BUpwJETDv757luzq3dwlVmf-iZsLwhWuAaDSFBPH5zhlWo-oVkqdXqjYMUDhdMAbsUlkXfz3VfOiTA3jggdCNm00)

