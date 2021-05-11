wc, hc, ws, hs = [int(x) for x in input().split(" ")]

computer = wc * hc
sticker  = ws * hs
if computer > sticker:
    pass


elif sticker > computer:
    print(0)