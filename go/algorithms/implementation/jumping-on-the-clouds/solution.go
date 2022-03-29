package clouds

func JumpingOnClouds(c []int32) int32 {
	var current int
	var counter int32
	for current < len(c)-1 {
		next := current + 2
		if next >= len(c) {
			next = len(c) - 1
		} else if c[next] != 0 {
			next = current + 1
		}
		current = next
		counter++
	}
	return counter
}
