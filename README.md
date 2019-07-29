# icutest

```shell
mvn3 clean compile assembly:single
java -cp ./target/icutest-1.0-SNAPSHOT-jar-with-dependencies.jar org.test.icutest.TestGetBestPattern
```

output
```
[ca] [EEEE, d MMM] [dilluns, 29 de jul.]
[fr] [EEEE d MMM] [lundi 29 juil.]
[de] [EEEE, d. MMM] [Montag, 29. Juli]
[ja] [M月d日EEEE] [7月29日月曜日]
```
