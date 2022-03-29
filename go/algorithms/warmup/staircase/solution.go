package staircase

import "fmt"

func Staircase(n int32) {
	for i := int32(0); i < n; i += 1 {
		var s string
		for j := int32(0); j < n; j += 1 {
			if j < n-(i+1) {
				s += " "
			} else {
				s += "#"
			}
		}
		fmt.Println(s)
	}
}
