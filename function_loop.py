# 本 コーデングを支える技術 p58
# 本のとおりだとうまく動かない

def total(xs):
    result = 0
    for x in xs:
        print(type(x))
        // 本だとis_integerを用いていたがうまく動かなかったため変更
        if isinstance(x, int):
            result += x
            print(result)
        else:
            # xは入れ子リストなのでtotalで中身を合計する！
            result += total(x)
            print(result)
    return result
    

total([1,2,[3,4],5])
