# banking_system.py

# Placeholder code for Simple Banking System
class BankAccount:
    def __init__(self, account_holder, balance=0):
        self.account_holder = account_holder
        self.balance = balance

    def deposit(self, amount):
        self.balance += amount
        print(f"{amount} deposited. Current balance: {self.balance}")

    def withdraw(self, amount):
        if self.balance >= amount:
            self.balance -= amount
            print(f"{amount} withdrawn. Current balance: {self.balance}")
        else:
            print("Insufficient funds")

    def get_balance(self):
        print(f"Current balance: {self.balance}")

# Placeholder main function
def main():
    print("Welcome to the Simple Banking System!")
    account = BankAccount("Akshit", 1000)
    account.deposit(500)
    account.withdraw(200)
    account.get_balance()

if __name__ == "__main__":
    main()
