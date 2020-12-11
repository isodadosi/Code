# 本 コーデングを支える技術 西尾泰和
# 本のとおりだとうまく動かない

def total(xs):
    result = 0
    for x in xs:
        if x.is_integer:
            result += x
    else:
        # xは入れ子リストなのでtotalで中身を合計する！
        result += total(x)
    return result

total [1,2[3,4],5]