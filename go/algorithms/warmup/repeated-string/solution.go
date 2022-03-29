package string

func RepeatedString(s string, n int64) int64 {
	//count how many 'a' in s
	var count int64
	var leftover int64
	mod := int(n) % len(s)
	for i, c := range s {
		if c == 'a' {
			count++
			if i < mod {
				leftover++
			}
		}
	}
	return count*(n/int64(len(s))) + leftover
}
