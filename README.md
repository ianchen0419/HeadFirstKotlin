# HeadFirstKotlin

Head First Kotlin的讀書筆記

## 測試Kotlin程式碼片段：REPL

REPL（Read-Eval-Print Loop）能夠測試主程式以外的Kotlin片段

1. 開啟IntelliJ IDEA
2. 上方工具列選擇：「Tool」→「Kotlin」→「Kotlin REPL」
3. 畫面底部跳出窗格，可以執行片段程式碼


## `var`與`val`

- `var`：可改變
- `val`：不可改變

## 整數

Kotlin有4種整數類型

| 類型 | bits容量 | 數字範圍（只有整數） |
| --- | -------- | ------ |
| `Byte` | 8 | -128 到 127 |
| `Short` | 16 | -32768 到 32767 |
| `Int` | 32 | -2147483648 到 2147483647 |
| `Long` | 64 | -huge to (huge - 1) |

預設情況下以`Int`型別建立
```kt
var x = 1 // 建立`Int`型別的變數，如果值太多超過`Int`上限，則會以`Long`代替
```

直接在數字末端加上「L」，表示指定該型別為`Long`
```kt
var x = 1L // 建立`Long`型別的變數，值為1
```

二進制數：在數字前面加上「0b」
```kt
var x = 0b10 // 二進制「10」轉成十進制：1*(2^1) + 0*(2^0) = 2
```

十六進制數：在數字前面加上「0x」

```kt
var x = 0xAB // 十六進制「10」轉成十進制：A表示10，B表示11，AB為10*(16^1) + 11*(16^0) = 160 + 11 = 171
```
八進制數：不支援

## 浮點數

- `Float`：儲存32位元
- `Double`：儲存64位元

預設情況下以`Double`型別建立
```kt
var x = 123.5 // 建立`Double`型別
```

若要特別指定為`Float`，可在數字末端加上「F」或「f」
```kt
var x = 123.5F // 建立`Float`型別
```


