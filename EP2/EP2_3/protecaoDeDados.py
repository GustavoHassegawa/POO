class Aluno:
    def __init__(self):
        self.__nome = None
        self.__ra = None
    
    def setName(self, nome: str):
        self.__nome = nome
    
    def setRa(self, ra: int):
        self.__ra = ra

    def getName(self):
        return self.__nome
    
    def getRa(self):
        return self.__ra
    

name_input = input()
ra_input = int(input())
aluno = Aluno()
aluno.setName(name_input())
aluno.setRa(ra_input())

print(f"Aluno: {aluno.getName()}, Matricula {aluno.getRa()}")