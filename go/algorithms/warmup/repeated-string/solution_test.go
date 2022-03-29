package string

import "testing"

func TestRepeatedString(t *testing.T) {
	type args struct {
		s string
		n int64
	}
	tests := []struct {
		name string
		args args
		want int64
	}{
		{
			args: args{
				s: "aba",
				n: 10,
			},
			want: 7,
		},
		{
			args: args{
				s: "a",
				n: 1000000000000,
			},
			want: 1000000000000,
		},
		{
			args: args{
				s: "ab",
				n: 1,
			},
			want: 1,
		},
		{
			args: args{
				s: "b",
				n: 500,
			},
			want: 0,
		},
		{
			args: args{
				s: "epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq",
				n: 549382313570,
			},
			want: 16481469408,
		},
		{
			args: args{
				s: "ojowrdcpavatfacuunxycyrmpbkvaxyrsgquwehhurnicgicmrpmgegftjszgvsgqavcrvdtsxlkxjpqtlnkjuyraknwxmnthfpt",
				n: 685118368975,
			},
			want: 41107102139,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := RepeatedString(tt.args.s, tt.args.n); got != tt.want {
				t.Errorf("RepeatedString() = %v, want %v", got, tt.want)
			}
		})
	}
}
