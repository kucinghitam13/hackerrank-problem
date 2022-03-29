package triplets

func CompareTriplets(a []int32, b []int32) []int32 {
	score := []int32{0, 0}
	for i := 0; i < len(a); i += 1 {
		if a[i] > b[i] {
			score[0] += 1
		} else if a[i] < b[i] {
			score[1] += 1
		}
	}
	return score
}
