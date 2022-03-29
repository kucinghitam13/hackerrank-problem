package conversion

import (
	"fmt"
	"strconv"
)

func TimeConversion(s string) string {
	hour, _ := strconv.Atoi(s[:2])
	period := s[len(s)-2:]
	switch period {
	case "AM":
		if hour == 12 {
			hour = 0
		}
	case "PM":
		if hour != 12 {
			hour += 12
		}
	}
	return fmt.Sprintf("%02d%s", hour, s[2:len(s)-2])
}
