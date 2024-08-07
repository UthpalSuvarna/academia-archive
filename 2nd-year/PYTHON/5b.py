inv = {'arrow': 12, 'gold coin': 42, 'rope': 1, 'torch': 6, 'dagger': 1}


def displayinventory(inventory):
    total = 0
    for k, v in inventory.items():
        print(str(v)+' '+k)
        total += v
    print('Total number of items: '+str(total))


displayinventory(inv)

inv1 = {'rope': 1, 'gold coin': 42}
addeditems = ['gold coin', 'dagger', 'gold coin', 'gold coin', 'ruby']


def addtoinventory(inventory, addeditems):
    for item in addeditems:
        inventory[item] = inventory.get(item, 0)+1


addtoinventory(inv1, addeditems)
displayinventory(inv1)
