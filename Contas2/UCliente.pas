unit UCliente;

interface

type

  TCliente = class
  private
    Nome: String;
  public
    constructor Create(Nome: String);
    function getNome: String;
  end;

  TClientePessoaFisica = class(TCliente)
  private
    Profissao: String;
  public
    constructor Create(Nome: String);
    procedure SetProfissao(Value: String);
    function GetProfissao: String;
  end;

  TClientePessoaJuridica = class(TCliente)
  end;



implementation

{ TCliente }

constructor TCliente.Create(Nome: String);
begin
Self.Nome:=Nome;
end;

function TCliente.getNome: String;
begin
Result:=Nome;
end;

{ TClientePessoaFisica }

constructor TClientePessoaFisica.Create(Nome: String);
begin
inherited;
Profissao:='';
end;

function TClientePessoaFisica.GetProfissao: String;
begin
Result:=Profissao;
end;

procedure TClientePessoaFisica.SetProfissao(Value: String);
begin
Profissao:=Value;
end;

end.
