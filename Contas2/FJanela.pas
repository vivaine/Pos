unit FJanela;

interface

uses
  Forms, Dialogs, SysUtils;

type
  TJanela = class(TForm)
    procedure FormCreate(Sender: TObject);
  end;

var
  Janela: TJanela;

implementation

uses
  UConta, UCliente, UTipoConta;

{$R *.dfm}

procedure TJanela.FormCreate(Sender: TObject);
var
  Conta: TConta;
  Cliente: TCliente;
begin
Cliente:=TClientePessoaFisica.Create('Joana');
Conta:=TConta.Create(Cliente, tcConjunta);
Conta.Deposita(1000);
ShowMessage('Saldo Bruto = '+FloatToStr(Conta.GetSaldo));
ShowMessage('Saldo Líquido = '+FloatToStr(
    Conta.getTipoConta.getJuros.CalculaJuros(
        Conta.getTipoConta.getDesconto.CalculaDesconto(
        Conta.GetSaldo))));
end;

end.
