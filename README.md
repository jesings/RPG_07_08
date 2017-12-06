# RPG_07_08
## Character
Character is the parent class, which defines the initial members for its subclasses.
## Monster
Monster is a daughter class of Character and encompasses the Monster-specific members.
## Protagonist
Protagonist is another daughter class of Character and encompasses the Protagonist-specific members.
### Mage
Mage is a subclass of Protagonist which adds MP, Magic, and a spellBook.
#### DarkMage, GreyMage, LightMage
DarkMage, GreyMage and LightMage are all subclasses that borrow stats from the Mage class, which is a subclass of Protagonist.
### Skeleton, Wisp, Wraith
Skeleton, Wisp, and Wraith are all subclasses of Monster. They are almost all similar except Wraith and Wisp both have a magic variable.
## MageSpell
MageSpell is a class (with no parents or daughters) that encompasses all the different spells that a mage can cast.
