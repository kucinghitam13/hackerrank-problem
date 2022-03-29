package ds

func HourglassSum(arr [][]int32) int32 {
	const width = 3
	var max *int32
	for i := 0; i <= len(arr)-width; i++ {
		for j := 0; j <= len(arr)-width; j++ {
			result := arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] +
				arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]
			if max == nil {
				max = new(int32)
				*max = result
			} else if result > *max {
				*max = result
			}
		}
	}
	return *max
}
