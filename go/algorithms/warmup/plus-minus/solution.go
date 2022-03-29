package minus

import "fmt"

func PlusMinus(arr []int32) {
	plus, minus, zero, n := 0, 0, 0, len(arr)
	for _, v := range arr {
		if v > 0 {
			plus += 1
		} else if v < 0 {
			minus += 1
		} else {
			zero += 1
		}
	}
	fmt.Printf("%.6f\n", float64(plus)/float64(n))
	fmt.Printf("%.6f\n", float64(minus)/float64(n))
	fmt.Printf("%.6f\n", float64(zero)/float64(n))
}
