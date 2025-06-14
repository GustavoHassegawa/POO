class Usuario:
    def __init__(self, nome: str, senha: str):
        self.__nome = nome
        self.__senha = senha

    def exibir(self):
        return f"Usuário: {self.__nome}"
    
user_input = input()
password_input = input()

conta = Usuario(user_input, password_input)

print(conta.exibir())
