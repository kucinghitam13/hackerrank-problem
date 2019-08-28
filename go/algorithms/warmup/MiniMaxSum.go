package main

import (
    "bufio"
    "fmt"
    "io"
    "os"
    "strconv"
    "strings"
)

// Complete the miniMaxSum function below.
func miniMaxSum(arr []int64) {
    var min, max, sum int64 = arr[0], arr[0], 0
    for _, v := range arr{
        sum += v
        if v < min{
            min = v
        }else if v > max{
            max = v
        }
    }
    fmt.Println(sum-max, sum-min)
}

func main() {
    reader := bufio.NewReaderSize(os.Stdin, 1024 * 1024)

    arrTemp := strings.Split(readLine(reader), " ")

    var arr []int64

    for i := 0; i < 5; i++ {
        arrItemTemp, err := strconv.ParseInt(arrTemp[i], 10, 64)
        checkError(err)
        arrItem := int64(arrItemTemp)
        arr = append(arr, arrItem)
    }

    miniMaxSum(arr)
}

func readLine(reader *bufio.Reader) string {
    str, _, err := reader.ReadLine()
    if err == io.EOF {
        return ""
    }

    return strings.TrimRight(string(str), "\r\n")
}

func checkError(err error) {
    if err != nil {
        panic(err)
    }
}
