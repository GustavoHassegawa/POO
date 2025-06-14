class Conta:
    def __init__(self, saldo: int):
        self.__saldo = saldo

    def sacar(self, valor: int):
        self.__saldo -= valor
    
    def depositar(self, valor: int):
        self.__saldo += valor

    def verSaldo(self):
        return f"Saldo atual: R$ {self.__saldo}"
    
valor_input = int(input())
action = input()
conta = Conta(valor_input)
valor = int(input())

if (action == "depositar"):
    conta.depositar(valor)
elif (action == "sacar"):
    conta.sacar(valor)
else:
    print("Nenhuma ação tomada")

print(conta.verSaldo())