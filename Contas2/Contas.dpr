program Contas;

uses
  Vcl.Forms,
  UConta in 'UConta.pas',
  UCliente in 'UCliente.pas',
  UJuros in 'UJuros.pas',
  UTipoConta in 'UTipoConta.pas',
  FJanela in 'FJanela.pas' {Janela},
  UDesconto in 'UDesconto.pas';

{$R *.res}

begin
  Application.Initialize;
  Application.MainFormOnTaskbar := True;
  Application.CreateForm(TJanela, Janela);
  Application.Run;
end.
