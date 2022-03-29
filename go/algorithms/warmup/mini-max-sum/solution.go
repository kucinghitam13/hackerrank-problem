package sum

import "fmt"

func MiniMaxSum(arr []int64) {
	var min, max, sum int64 = arr[0], arr[0], 0
	for _, v := range arr {
		sum += v
		if v < min {
			min = v
		} else if v > max {
			max = v
		}
	}
	fmt.Println(sum-max, sum-min)
}
