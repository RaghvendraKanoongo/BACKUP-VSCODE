List = [1, 2, 4, 4, 3, 3, 3, 6, 5]
print("\nList with the use of Numbers: ")
print(List)
print("\nLength: ",len(List))
List.append(11)
List.append(22)
List.append(44)
print("\nAfter Appanding:")
print(List)
List.insert(3, 'Raghav is Pro')
print("\nAfter insertion at a given pos")
print(List)
print("\nPrinting a value of postion:")
print(List[3],List[5]), List[12]
print("\nRemoving elements")
List.remove(5)
List.remove(1)
List.remove(2)
List.remove(4)
print(List)
print("\nPopping elements")
List.pop(0);
List.pop(1);
List.pop(5);
print(List)
