package sum

func SimpleArraySum(ar []int32) (sum int32) {
	sum = 0
	for i := 0; i < len(ar); i += 1 {
		sum += ar[i]
	}
	return
}
