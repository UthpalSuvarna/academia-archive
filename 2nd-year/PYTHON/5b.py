inv={'arrow': 12, 'gold coin': 42, 'rope': 1, 'torch': 6, 'dagger': 1}

def displayInvetory(inventory):
    total =0
    for k,v in inventory.items():
        print(str(v)+' '+k)
        total =total + inventory.get(k,0);
    print("Total number of items: "+str(total))
displayInvetory(inv)

inv1={'rope':1,'gold coin':42}
addeditems=['gold coin','dagger','gold coin','gold coin','ruby']

def addInventory(inventory,addeditems):
    for item in addeditems:
        inventory[item]=inventory.get(item,0)+1

addInventory(inv1,addeditems)
displayInvetory(inv1)