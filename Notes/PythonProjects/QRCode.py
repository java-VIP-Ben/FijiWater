import qrcode 
from pathlib import Path

#ID = 10
ID = input("Input ID\n")
print(ID)
Name = input("Input Name\n")
# filename = input("Input FileName\n")
filename="Person"+str(ID)
print(filename)
img = qrcode.make(f"{ID},{Name}")
# img = qrcode.make("youtube.com")
image_path = str(Path.home() / "Downloads")
img.save(f"{image_path}/{filename}.jpg")
img.save(f"{image_path}/{filename}.jpg")
    
    