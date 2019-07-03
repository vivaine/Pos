unit UDesconto;

interface

type

  TDesconto = class
  private
    Desconto: Double;
  public
    constructor Create(Desconto: Double);
    function CalculaDesconto(Valor: Double): Double;
  end;

implementation

{ TDesconto }

constructor TDesconto.Create(Desconto: Double);
begin
Self.Desconto:=Desconto;
end;

function TDesconto.CalculaDesconto(Valor: Double): Double;
begin
Result:=Valor-(Valor*Desconto/100);
end;

end.
