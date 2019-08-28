package main

import (
	"bufio"
	"fmt"
	"io"
	"os"
	"strconv"
	"strings"
)

/*
 * Complete the timeConversion function below.
 */
func timeConversion(s string) string {
	hour, _ := strconv.Atoi(s[:2])
	period := s[len(s)-2:]
	switch period {
	case "AM":
		if hour == 12 {
			hour = 0
		}
	case "PM":
		if hour != 12 {
			hour += 12
		}
	}
	return fmt.Sprintf("%02d%s", hour, s[2:len(s)-2])
}

func main() {
	reader := bufio.NewReaderSize(os.Stdin, 1024*1024)

	outputFile, err := os.Create(os.Getenv("OUTPUT_PATH"))
	checkError(err)

	defer outputFile.Close()

	writer := bufio.NewWriterSize(outputFile, 1024*1024)

	s := readLine(reader)

	result := timeConversion(s)

	fmt.Fprintf(writer, "%s\n", result)

	writer.Flush()
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
