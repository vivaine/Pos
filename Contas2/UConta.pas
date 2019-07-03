unit UConta;

interface

uses
  UCliente, UTipoConta;

type

  TConta = class
  private
    Saldo: Double;
    Cliente: TCliente;
    TipoConta: TTipoConta;
  public
    constructor Create(Cliente: TCliente; TipoConta: TETipoConta);
    destructor Destroy;
    function getTipoConta: TTipoConta;
    function GetSaldo: Double;
    function Saca(ValorDoSaque: Double): Boolean;
    procedure Deposita(ValorDeposito: Double);
  end;

implementation

constructor TConta.Create(Cliente: TCliente; TipoConta: TETipoConta);
begin
Self.Cliente:=Cliente;
Self.TipoConta:=TTipoConta.Create(TipoConta);
end;

destructor TConta.Destroy;
begin
TipoConta.Free;
end;

function TConta.GetSaldo: Double;
begin
Result:=Saldo;
end;

function TConta.getTipoConta: TTipoConta;
begin
Result:=TipoConta;
end;

function TConta.Saca(ValorDoSaque: Double): Boolean;
begin
if GetSaldo<ValorDoSaque then
  Result:=False
else
  begin
  Saldo:=Saldo-ValorDoSaque;
  Result:=True;
  end;
end;

procedure TConta.Deposita(ValorDeposito: Double);
begin
Saldo:=Saldo+ValorDeposito;
end;

end.
