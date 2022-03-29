package ds

import "testing"

func TestHourglassSum(t *testing.T) {
	type args struct {
		arr [][]int32
	}
	tests := []struct {
		name string
		args args
		want int32
	}{
		{
			args: args{
				arr: [][]int32{
					[]int32{-1, -1, 0, -9, -2, -2},
					[]int32{-2, -1, -6, -8, -2, -5},
					[]int32{-1, -1, -1, -2, -3, -4},
					[]int32{-1, -9, -2, -4, -4, -5},
					[]int32{-7, -3, -3, -2, -9, -9},
					[]int32{-1, -3, -1, -2, -4, -5},
				},
			},
			want: -6,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := HourglassSum(tt.args.arr); got != tt.want {
				t.Errorf("HourglassSum() = %v, want %v", got, tt.want)
			}
		})
	}
}
