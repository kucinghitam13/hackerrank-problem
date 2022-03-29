package candles

func BirthdayCakeCandles(ar []int32) int32 {
	var max, count int32 = ar[0], 1
	for i := 1; i < len(ar); i += 1 {
		if ar[i] > max {
			max = ar[i]
			count = 1
		} else if ar[i] == max {
			count += 1
		}
	}
	return count
}
