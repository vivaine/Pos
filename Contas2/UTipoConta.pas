unit UTipoConta;

interface

uses
  UJuros, UDesconto;

type

  TETipoConta = (tcConjunta, tcCorrente, tcEmpresarial, tcEstudante);

  TTipoConta = class
  private
    Desconto: TDesconto;
    Juros: TJuros;
    Tipo: TETipoConta;
  public
    constructor Create(Tipo: TETipoConta);
    destructor Destroy;
    function getDesconto: TDesconto;
    function getJuros: TJuros;
  end;


implementation

{ TTipoConta }

constructor TTipoConta.Create(Tipo: TETipoConta);
begin
Self.Tipo:=Tipo;
if Tipo=tcConjunta then
  begin
  Desconto:=TDesconto.Create(2);
  Juros:=TJuros.Create(2.5);
  end
else if Tipo=tcCorrente then
  begin
  Desconto:=TDesconto.Create(3);
  Juros:=TJuros.Create(3.7);
  end
else if Tipo=tcEmpresarial then
  begin
  Desconto:=TDesconto.Create(12);
  Juros:=TJuros.Create(1.2);
  end
else if Tipo=tcEstudante then
  begin
  Desconto:=TDesconto.Create(14);
  Juros:=TJuros.Create(0.6);
  end
else
  begin
  Desconto:=TDesconto.Create(0);
  Juros:=TJuros.Create(0);
  end;
end;

destructor TTipoConta.Destroy;
begin
Desconto.Free;
Juros.Free;
end;

function TTipoConta.getDesconto: TDesconto;
begin
Result:=Desconto;
end;

function TTipoConta.getJuros: TJuros;
begin
Result:=Juros;
end;

end.
