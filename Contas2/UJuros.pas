unit UJuros;

interface

type

  TJuros = class
  private
    Taxa: Double;
  public
    constructor Create(Taxa: Double);
    function CalculaJuros(Valor: Double): Double;
  end;

implementation

{ TCalculoTaxaJuros }

function TJuros.CalculaJuros(Valor: Double): Double;
begin
Result:=Valor+Valor*Taxa/100;
end;

constructor TJuros.Create(Taxa: Double);
begin
Self.Taxa:=Taxa;
end;

end.
