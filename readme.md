Testcase with 500 requests:
===========================

### Okhttp3 1st:

![70958514_2457843667656117_6478014226693619712_n.png](https://tathuan.files.wordpress.com/2019/09/70958514_2457843667656117_6478014226693619712_n.png)

Heap size peak: 142Mb\
Theads peak: 19\
Executed time: 177s

### Okhttp 2nd:![71043989_390783571820632_8669616027866234880_n.png](https://tathuan.files.wordpress.com/2019/09/71043989_390783571820632_8669616027866234880_n.png)

Heap size peak: 160Mb\
Theads peak: 20\
Executed time: 132s

### Vertx-web-client 1st:

![70728256_2453052701644264_8040045509571772416_n.png](https://tathuan.files.wordpress.com/2019/09/70728256_2453052701644264_8040045509571772416_n.png)

Heap size peak: 237Mb\
Theads peak: 14\
Executed time: 91s

### Vertx-web-client 2nd:

![71598342_390043178558066_4592737885437820928_n.png](https://tathuan.files.wordpress.com/2019/09/71598342_390043178558066_4592737885437820928_n.png)

Heap size peak: 252Mb\
Theads peak: 14\
Executed time: 104s