package rotation

func RotLeft(a []int32, d int32) []int32 {
	idx := int(d) % len(a)
	return append(a[idx:], a[:idx]...)
}
